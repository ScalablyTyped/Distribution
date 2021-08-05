package typings.jsonBigint

import org.scalablytyped.runtime.Shortcut
import typings.jsonBigint.anon.Parse
import typings.jsonBigint.anon.Stringify
import typings.jsonBigint.jsonBigintStrings.error
import typings.jsonBigint.jsonBigintStrings.ignore
import typings.jsonBigint.jsonBigintStrings.preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("json-bigint", JSImport.Namespace)
  @js.native
  val ^ : JSONBigExport = js.native
  
  type JSONBigExport = (js.Function1[/* options */ js.UndefOr[Options], Parse]) & Stringify
  
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var alwaysParseAsBig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 'error'
      */
    var constructorAction: js.UndefOr[error | ignore | preserve] = js.undefined
    
    /**
      * @default 'error'
      */
    var protoAction: js.UndefOr[error | ignore | preserve] = js.undefined
    
    /**
      * @default false
      */
    var storeAsString: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var useNativeBigInt: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlwaysParseAsBig(value: Boolean): Self = StObject.set(x, "alwaysParseAsBig", value.asInstanceOf[js.Any])
      
      inline def setAlwaysParseAsBigUndefined: Self = StObject.set(x, "alwaysParseAsBig", js.undefined)
      
      inline def setConstructorAction(value: error | ignore | preserve): Self = StObject.set(x, "constructorAction", value.asInstanceOf[js.Any])
      
      inline def setConstructorActionUndefined: Self = StObject.set(x, "constructorAction", js.undefined)
      
      inline def setProtoAction(value: error | ignore | preserve): Self = StObject.set(x, "protoAction", value.asInstanceOf[js.Any])
      
      inline def setProtoActionUndefined: Self = StObject.set(x, "protoAction", js.undefined)
      
      inline def setStoreAsString(value: Boolean): Self = StObject.set(x, "storeAsString", value.asInstanceOf[js.Any])
      
      inline def setStoreAsStringUndefined: Self = StObject.set(x, "storeAsString", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setUseNativeBigInt(value: Boolean): Self = StObject.set(x, "useNativeBigInt", value.asInstanceOf[js.Any])
      
      inline def setUseNativeBigIntUndefined: Self = StObject.set(x, "useNativeBigInt", js.undefined)
    }
  }
  
  type _To = JSONBigExport
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JSONBigExport = ^
}
