package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Libp2pAny
import typings.ipfsCore.anon.RateIn
import typings.std.AsyncGenerator
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stats_ extends js.Object {
  
  var bw: ReturnType[
    js.Function1[
      /* hasLibp2p */ Libp2pAny, 
      js.Function1[/* options */ js.UndefOr[_], AsyncGenerator[RateIn, Unit, _]]
    ]
  ] = js.native
}
object Stats_ {
  
  @scala.inline
  def apply(
    bw: ReturnType[
      js.Function1[
        /* hasLibp2p */ Libp2pAny, 
        js.Function1[/* options */ js.UndefOr[_], AsyncGenerator[RateIn, Unit, _]]
      ]
    ]
  ): Stats_ = {
    val __obj = js.Dynamic.literal(bw = bw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats_]
  }
  
  @scala.inline
  implicit class Stats_Ops[Self <: Stats_] (val x: Self) extends AnyVal {
    
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
    def setBw(
      value: ReturnType[
          js.Function1[
            /* hasLibp2p */ Libp2pAny, 
            js.Function1[/* options */ js.UndefOr[_], AsyncGenerator[RateIn, Unit, _]]
          ]
        ]
    ): Self = this.set("bw", value.asInstanceOf[js.Any])
  }
}
