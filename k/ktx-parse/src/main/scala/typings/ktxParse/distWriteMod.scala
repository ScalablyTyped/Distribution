package typings.ktxParse

import typings.ktxParse.distContainerMod.KTX2Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWriteMod {
  
  @JSImport("ktx-parse/dist/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def write(container: KTX2Container): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(container.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def write(container: KTX2Container, options: WriteOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  trait WriteOptions extends StObject {
    
    var keepWriter: js.UndefOr[Boolean] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      inline def setKeepWriter(value: Boolean): Self = StObject.set(x, "keepWriter", value.asInstanceOf[js.Any])
      
      inline def setKeepWriterUndefined: Self = StObject.set(x, "keepWriter", js.undefined)
    }
  }
}
