package typings.gotResume.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.PromiseConstructor
import typings.std.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToFileOptions extends TransferOptions {
  
  /** Promise implementation to use (default: Bluebird v2). */
  var Promise: js.UndefOr[
    PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]), 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      typings.std.global.Promise[js.Object]
    ])
  ] = js.native
  
  /** Function called with progress. */
  var onProgress: js.UndefOr[js.Function1[/* progress */ Progress, Unit]] = js.native
  
  /** Function called with HTTP response. */
  var onResponse: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
}
object ToFileOptions {
  
  @scala.inline
  def apply(): ToFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToFileOptions]
  }
  
  @scala.inline
  implicit class ToFileOptionsOps[Self <: ToFileOptions] (val x: Self) extends AnyVal {
    
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
    def setPromise(
      value: PromiseConstructor with (Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]), 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          Promise[js.Object]
        ])
    ): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* progress */ Progress => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnResponse(value: /* res */ js.Any => Unit): Self = this.set("onResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResponse: Self = this.set("onResponse", js.undefined)
  }
}
