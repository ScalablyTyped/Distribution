package typings.koaMulter.mod

import typings.node.httpMod.IncomingMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskStorageOptions extends js.Object {
  
  /** A function used to determine within which folder the uploaded files should be stored. Defaults to the system's default temporary directory. */
  var destination: js.UndefOr[
    String | (js.Function3[
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit], 
      Unit
    ])
  ] = js.native
  
  /** A function used to determine what the file should be named inside the folder. Defaults to a random name with no file extension. */
  var filename: js.UndefOr[
    js.Function3[
      /* req */ IncomingMessage, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ Error | Null, /* filename */ String, Unit], 
      Unit
    ]
  ] = js.native
}
object DiskStorageOptions {
  
  @scala.inline
  def apply(): DiskStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskStorageOptions]
  }
  
  @scala.inline
  implicit class DiskStorageOptionsOps[Self <: DiskStorageOptions] (val x: Self) extends AnyVal {
    
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
    def setDestinationFunction3(
      value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit]) => Unit
    ): Self = this.set("destination", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDestination(
      value: String | (js.Function3[
          /* req */ IncomingMessage, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Error | Null, /* destination */ String, Unit], 
          Unit
        ])
    ): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setFilename(
      value: (/* req */ IncomingMessage, /* file */ File, /* callback */ js.Function2[/* error */ Error | Null, /* filename */ String, Unit]) => Unit
    ): Self = this.set("filename", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
}
