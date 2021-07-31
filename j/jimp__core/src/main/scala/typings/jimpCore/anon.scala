package typings.jimpCore

import org.scalablytyped.runtime.StringDictionary
import typings.jimpCore.etcMod.ChangeName
import typings.jimpCore.etcMod.Image
import typings.jimpCore.etcMod.ListenableName
import typings.jimpCore.etcMod.ListenerData
import typings.jimpCore.jimpCoreStrings.`before-change`
import typings.jimpCore.jimpCoreStrings.changed
import typings.jimpCore.jimpCoreStrings.clone
import typings.jimpCore.jimpCoreStrings.constructor
import typings.jimpCore.pluginsMod.JimpPlugin
import typings.jimpCore.pluginsMod.JimpType
import typings.jimpCore.utilsMod.FunctionRet
import typings.jimpCore.utilsMod.GetPluginFuncArrDecoders
import typings.jimpCore.utilsMod.GetPluginFuncArrEncoders
import typings.jimpCore.utilsMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `class`: /* import warning: importer.ImportType#apply Failed type conversion: infer Class */ js.Any
  }
  object `0` {
    
    @scala.inline
    def apply(
      `class`: /* import warning: importer.ImportType#apply Failed type conversion: infer Class */ js.Any
    ): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: /* import warning: importer.ImportType#apply Failed type conversion: infer Class */ js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    }
  }
  
  trait Class extends StObject {
    
    var `class`: js.UndefOr[scala.Nothing] = js.undefined
    
    var constants: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait Constants extends StObject {
    
    var constants: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any
  }
  object Constants {
    
    @scala.inline
    def apply(
      constants: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any
    ): Constants = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    @scala.inline
    implicit class ConstantsMutableBuilder[Self <: Constants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstants(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer Constants */ js.Any
      ): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    }
  }
  
  trait Decoders extends StObject {
    
    var decoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any
  }
  object Decoders {
    
    @scala.inline
    def apply(
      decoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any
    ): Decoders = {
      val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decoders]
    }
    
    @scala.inline
    implicit class DecodersMutableBuilder[Self <: Decoders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecoders(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer Decoders */ js.Any
      ): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecodersEncoders[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] extends StObject {
    
    var decoders: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]]
    
    var encoders: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]
  }
  object DecodersEncoders {
    
    @scala.inline
    def apply[PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */](
      decoders: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]],
      encoders: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]
    ): DecodersEncoders[PluginFuncArr] = {
      val __obj = js.Dynamic.literal(decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodersEncoders[PluginFuncArr]]
    }
    
    @scala.inline
    implicit class DecodersEncodersMutableBuilder[Self <: DecodersEncoders[?], PluginFuncArr /* <: FunctionRet[JimpPlugin[Image] | JimpType[Image]] */] (val x: Self & DecodersEncoders[PluginFuncArr]) extends AnyVal {
      
      @scala.inline
      def setDecoders(value: UnionToIntersection[GetPluginFuncArrDecoders[PluginFuncArr]]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoders(value: UnionToIntersection[GetPluginFuncArrEncoders[PluginFuncArr]]): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey[T /* <: ListenableName */]
    extends StObject
       with /* key */ StringDictionary[js.Any]
       with ListenerData[T] {
    
    var eventName: `before-change` | changed
    
    var methodName: T
  }
  object Dictkey {
    
    @scala.inline
    def apply[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): Dictkey[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey[T]]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey[?], T /* <: ListenableName */] (val x: Self & Dictkey[T]) extends AnyVal {
      
      @scala.inline
      def setEventName(value: `before-change` | changed): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: T): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoders extends StObject {
    
    var encoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any
  }
  object Encoders {
    
    @scala.inline
    def apply(
      encoders: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any
    ): Encoders = {
      val __obj = js.Dynamic.literal(encoders = encoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoders]
    }
    
    @scala.inline
    implicit class EncodersMutableBuilder[Self <: Encoders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoders(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer Encoders */ js.Any
      ): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventName[T /* <: ListenableName */]
    extends StObject
       with ListenerData[T] {
    
    var eventName: T
    
    var methodName: clone | ChangeName | constructor
  }
  object EventName {
    
    @scala.inline
    def apply[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): EventName[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventName[T]]
    }
    
    @scala.inline
    implicit class EventNameMutableBuilder[Self <: EventName[?], T /* <: ListenableName */] (val x: Self & EventName[T]) extends AnyVal {
      
      @scala.inline
      def setEventName(value: T): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: clone | ChangeName | constructor): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<{  class :any}> */
  trait Requiredclassany extends StObject {
    
    var `class`: js.Any
  }
  object Requiredclassany {
    
    @scala.inline
    def apply(`class`: js.Any): Requiredclassany = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Requiredclassany]
    }
    
    @scala.inline
    implicit class RequiredclassanyMutableBuilder[Self <: Requiredclassany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<{  constants :any}> */
  trait Requiredconstantsany extends StObject {
    
    var constants: js.Any
  }
  object Requiredconstantsany {
    
    @scala.inline
    def apply(constants: js.Any): Requiredconstantsany = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
      __obj.asInstanceOf[Requiredconstantsany]
    }
    
    @scala.inline
    implicit class RequiredconstantsanyMutableBuilder[Self <: Requiredconstantsany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstants(value: js.Any): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
