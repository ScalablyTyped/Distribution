package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Bitswap
import typings.ipfsCore.anon.FnCallHasRepo
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitSwap_ extends js.Object {
  
  var stat: ReturnType[FnCallHasRepo] = js.native
  
  var unwant: ReturnType[
    js.Function1[
      /* hasBitswap */ Bitswap, 
      js.Function2[
        /* cids */ typings.cids.mod.^  | js.Array[typings.cids.mod.^], 
        /* options */ js.UndefOr[AbortOptions], 
        js.Promise[Unit]
      ]
    ]
  ] = js.native
  
  var wantlist: ReturnType[
    js.Function1[
      /* hasBitswap */ Bitswap, 
      js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[typings.cids.mod.^]]]
    ]
  ] = js.native
}
object BitSwap_ {
  
  @scala.inline
  def apply(
    stat: ReturnType[FnCallHasRepo],
    unwant: ReturnType[
      js.Function1[
        /* hasBitswap */ Bitswap, 
        js.Function2[
          /* cids */ typings.cids.mod.^  | js.Array[typings.cids.mod.^], 
          /* options */ js.UndefOr[AbortOptions], 
          js.Promise[Unit]
        ]
      ]
    ],
    wantlist: ReturnType[
      js.Function1[
        /* hasBitswap */ Bitswap, 
        js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[typings.cids.mod.^]]]
      ]
    ]
  ): BitSwap_ = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any], unwant = unwant.asInstanceOf[js.Any], wantlist = wantlist.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitSwap_]
  }
  
  @scala.inline
  implicit class BitSwap_Ops[Self <: BitSwap_] (val x: Self) extends AnyVal {
    
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
    def setStat(value: ReturnType[FnCallHasRepo]): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnwant(
      value: ReturnType[
          js.Function1[
            /* hasBitswap */ Bitswap, 
            js.Function2[
              /* cids */ typings.cids.mod.^  | js.Array[typings.cids.mod.^], 
              /* options */ js.UndefOr[AbortOptions], 
              js.Promise[Unit]
            ]
          ]
        ]
    ): Self = this.set("unwant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantlist(
      value: ReturnType[
          js.Function1[
            /* hasBitswap */ Bitswap, 
            js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[typings.cids.mod.^]]]
          ]
        ]
    ): Self = this.set("wantlist", value.asInstanceOf[js.Any])
  }
}
