package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.statMod.BitswapStats
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofbitswap extends js.Object {
  
  def stat_1(hasBitswap: BitswapAny): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[BitswapStats]] = js.native
  
  def unwant(hasBitswap: BitswapAny): js.Function2[
    /* cids */ ^  | js.Array[^], 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[Unit]
  ] = js.native
  
  def wantlist(hasBitswap: BitswapAny): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[^]]] = js.native
  
  def wantlistForPeer(hasBitswap: BitswapAny): js.Function2[
    /* peerId */ String | ^  | Uint8Array | typings.peerId.mod.^ , 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[js.Array[^]]
  ] = js.native
}
object Typeofbitswap {
  
  @scala.inline
  def apply(
    stat_1: BitswapAny => js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[BitswapStats]],
    unwant: BitswapAny => js.Function2[
      /* cids */ ^  | js.Array[^], 
      /* options */ js.UndefOr[AbortOptions], 
      js.Promise[Unit]
    ],
    wantlist: BitswapAny => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[^]]],
    wantlistForPeer: BitswapAny => js.Function2[
      /* peerId */ String | ^  | Uint8Array | typings.peerId.mod.^ , 
      /* options */ js.UndefOr[AbortOptions], 
      js.Promise[js.Array[^]]
    ]
  ): Typeofbitswap = {
    val __obj = js.Dynamic.literal(stat_1 = js.Any.fromFunction1(stat_1), unwant = js.Any.fromFunction1(unwant), wantlist = js.Any.fromFunction1(wantlist), wantlistForPeer = js.Any.fromFunction1(wantlistForPeer))
    __obj.asInstanceOf[Typeofbitswap]
  }
  
  @scala.inline
  implicit class TypeofbitswapOps[Self <: Typeofbitswap] (val x: Self) extends AnyVal {
    
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
    def setStat_1(
      value: BitswapAny => js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[BitswapStats]]
    ): Self = this.set("stat_1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnwant(
      value: BitswapAny => js.Function2[
          /* cids */ ^  | js.Array[^], 
          /* options */ js.UndefOr[AbortOptions], 
          js.Promise[Unit]
        ]
    ): Self = this.set("unwant", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWantlist(value: BitswapAny => js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[^]]]): Self = this.set("wantlist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWantlistForPeer(
      value: BitswapAny => js.Function2[
          /* peerId */ String | ^  | Uint8Array | typings.peerId.mod.^ , 
          /* options */ js.UndefOr[AbortOptions], 
          js.Promise[js.Array[^]]
        ]
    ): Self = this.set("wantlistForPeer", js.Any.fromFunction1(value))
  }
}
