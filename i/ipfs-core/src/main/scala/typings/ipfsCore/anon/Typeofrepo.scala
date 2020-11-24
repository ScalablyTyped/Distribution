package typings.ipfsCore.anon

import typings.ipfsCore.gcMod.BlockID
import typings.ipfsCore.gcMod.Err
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrepo extends js.Object {
  
  def gc(hasGcLockPinRefsRepo: Refs): js.Function1[/* _options */ js.UndefOr[AbortOptions], AsyncIterable[Err | BlockID]] = js.native
  
  def stat_3(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[NumObjects]] = js.native
  
  def version(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
}
object Typeofrepo {
  
  @scala.inline
  def apply(
    gc: Refs => js.Function1[/* _options */ js.UndefOr[AbortOptions], AsyncIterable[Err | BlockID]],
    stat_3: RepoAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[NumObjects]],
    version: RepoAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]]
  ): Typeofrepo = {
    val __obj = js.Dynamic.literal(gc = js.Any.fromFunction1(gc), stat_3 = js.Any.fromFunction1(stat_3), version = js.Any.fromFunction1(version))
    __obj.asInstanceOf[Typeofrepo]
  }
  
  @scala.inline
  implicit class TypeofrepoOps[Self <: Typeofrepo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGc(value: Refs => js.Function1[/* _options */ js.UndefOr[AbortOptions], AsyncIterable[Err | BlockID]]): Self = this.set("gc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStat_3(value: RepoAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[NumObjects]]): Self = this.set("stat_3", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(value: RepoAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]]): Self = this.set("version", js.Any.fromFunction1(value))
  }
}
