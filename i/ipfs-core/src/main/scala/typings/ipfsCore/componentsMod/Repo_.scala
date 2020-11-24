package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Fn0
import typings.ipfsCore.anon.FnCallHasRepo
import typings.ipfsCore.anon.GcLockPin
import typings.ipfsCore.gcMod.BlockID
import typings.ipfsCore.gcMod.Err
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repo_ extends js.Object {
  
  var gc: ReturnType[
    js.Function1[
      /* hasGcLockPinRefsRepo */ GcLockPin, 
      js.Function1[/* _options */ js.UndefOr[AbortOptions], AsyncIterable[Err | BlockID]]
    ]
  ] = js.native
  
  var stat: ReturnType[FnCallHasRepo] = js.native
  
  var version: ReturnType[Fn0] = js.native
}
object Repo_ {
  
  @scala.inline
  def apply(
    gc: ReturnType[
      js.Function1[
        /* hasGcLockPinRefsRepo */ GcLockPin, 
        js.Function1[/* _options */ js.UndefOr[AbortOptions], AsyncIterable[Err | BlockID]]
      ]
    ],
    stat: ReturnType[FnCallHasRepo],
    version: ReturnType[Fn0]
  ): Repo_ = {
    val __obj = js.Dynamic.literal(gc = gc.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repo_]
  }
  
  @scala.inline
  implicit class Repo_Ops[Self <: Repo_] (val x: Self) extends AnyVal {
    
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
    def setGc(
      value: ReturnType[
          js.Function1[
            /* hasGcLockPinRefsRepo */ GcLockPin, 
            js.Function1[/* _options */ js.UndefOr[AbortOptions], AsyncIterable[Err | BlockID]]
          ]
        ]
    ): Self = this.set("gc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: ReturnType[FnCallHasRepo]): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ReturnType[Fn0]): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
