package typings.magnetUri

import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("magnet-uri", JSImport.Namespace)
  @js.native
  val ^ : MagnetUri = js.native
  
  trait Instance
    extends StObject
       with Object {
    
    var announce: js.UndefOr[js.Array[String]] = js.undefined
    
    var as: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var dn: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var infoHash: js.UndefOr[String] = js.undefined
    
    var infoHashBuffer: js.UndefOr[Buffer] = js.undefined
    
    var ix: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var keywords: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var kt: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var tr: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var urlList: js.UndefOr[js.Array[String]] = js.undefined
    
    var ws: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var xs: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var xt: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Instance {
    
    inline def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): Instance = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setAnnounce(value: js.Array[String]): Self = StObject.set(x, "announce", value.asInstanceOf[js.Any])
      
      inline def setAnnounceUndefined: Self = StObject.set(x, "announce", js.undefined)
      
      inline def setAnnounceVarargs(value: String*): Self = StObject.set(x, "announce", js.Array(value*))
      
      inline def setAs(value: String | js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value*))
      
      inline def setDn(value: String | js.Array[String]): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
      
      inline def setDnUndefined: Self = StObject.set(x, "dn", js.undefined)
      
      inline def setDnVarargs(value: String*): Self = StObject.set(x, "dn", js.Array(value*))
      
      inline def setInfoHash(value: String): Self = StObject.set(x, "infoHash", value.asInstanceOf[js.Any])
      
      inline def setInfoHashBuffer(value: Buffer): Self = StObject.set(x, "infoHashBuffer", value.asInstanceOf[js.Any])
      
      inline def setInfoHashBufferUndefined: Self = StObject.set(x, "infoHashBuffer", js.undefined)
      
      inline def setInfoHashUndefined: Self = StObject.set(x, "infoHash", js.undefined)
      
      inline def setIx(value: Double | js.Array[Double]): Self = StObject.set(x, "ix", value.asInstanceOf[js.Any])
      
      inline def setIxUndefined: Self = StObject.set(x, "ix", js.undefined)
      
      inline def setIxVarargs(value: Double*): Self = StObject.set(x, "ix", js.Array(value*))
      
      inline def setKeywords(value: String | js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setKt(value: js.Array[String]): Self = StObject.set(x, "kt", value.asInstanceOf[js.Any])
      
      inline def setKtUndefined: Self = StObject.set(x, "kt", js.undefined)
      
      inline def setKtVarargs(value: String*): Self = StObject.set(x, "kt", js.Array(value*))
      
      inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setTr(value: String | js.Array[String]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      inline def setTrVarargs(value: String*): Self = StObject.set(x, "tr", js.Array(value*))
      
      inline def setUrlList(value: js.Array[String]): Self = StObject.set(x, "urlList", value.asInstanceOf[js.Any])
      
      inline def setUrlListUndefined: Self = StObject.set(x, "urlList", js.undefined)
      
      inline def setUrlListVarargs(value: String*): Self = StObject.set(x, "urlList", js.Array(value*))
      
      inline def setWs(value: String | js.Array[String]): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      inline def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      
      inline def setWsVarargs(value: String*): Self = StObject.set(x, "ws", js.Array(value*))
      
      inline def setXs(value: String | js.Array[String]): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXsVarargs(value: String*): Self = StObject.set(x, "xs", js.Array(value*))
      
      inline def setXt(value: String | js.Array[String]): Self = StObject.set(x, "xt", value.asInstanceOf[js.Any])
      
      inline def setXtUndefined: Self = StObject.set(x, "xt", js.undefined)
      
      inline def setXtVarargs(value: String*): Self = StObject.set(x, "xt", js.Array(value*))
    }
  }
  
  @js.native
  trait MagnetUri extends StObject {
    
    def apply(uri: String): Instance = js.native
    
    def decode(uri: String): Instance = js.native
    
    def encode(parsed: Instance): String = js.native
  }
  
  type _To = MagnetUri
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MagnetUri = ^
}
