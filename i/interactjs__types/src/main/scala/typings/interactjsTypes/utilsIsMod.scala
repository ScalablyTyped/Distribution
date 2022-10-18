package typings.interactjsTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsIsMod {
  
  object default {
    
    @JSImport("@interactjs/utils/is", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def array[T /* <: Any */](thing: Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
    
    inline def bool(thing: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    inline def docFrag(thing: Any): /* is std.DocumentFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("docFrag")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is std.DocumentFragment */ Boolean]
    
    inline def element(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("element")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def func(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def number(thing: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def `object`(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def plainObject(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("plainObject")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def string(thing: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def window(thing: Any): /* is std.Window */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("window")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is std.Window */ Boolean]
  }
}
