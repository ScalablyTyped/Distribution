package typings.lasso

import typings.lasso.lassoMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Crossorigin extends StObject {
    
    var crossorigin: String
    
    var integrity: String
  }
  object Crossorigin {
    
    @scala.inline
    def apply(crossorigin: String, integrity: String): Crossorigin = {
      val __obj = js.Dynamic.literal(crossorigin = crossorigin.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crossorigin]
    }
    
    @scala.inline
    implicit class CrossoriginMutableBuilder[Self <: Crossorigin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrossorigin(value: String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lasso extends StObject {
    
    var lasso: js.UndefOr[default] = js.undefined
    
    var sendOptions: js.UndefOr[js.Any] = js.undefined
  }
  object Lasso {
    
    @scala.inline
    def apply(): Lasso = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Lasso]
    }
    
    @scala.inline
    implicit class LassoMutableBuilder[Self <: Lasso] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLasso(value: default): Self = StObject.set(x, "lasso", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLassoUndefined: Self = StObject.set(x, "lasso", js.undefined)
      
      @scala.inline
      def setSendOptions(value: js.Any): Self = StObject.set(x, "sendOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendOptionsUndefined: Self = StObject.set(x, "sendOptions", js.undefined)
    }
  }
  
  trait Parts extends StObject {
    
    var parts: js.Array[String]
    
    var value: String
  }
  object Parts {
    
    @scala.inline
    def apply(parts: js.Array[String], value: String): Parts = {
      val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parts]
    }
    
    @scala.inline
    implicit class PartsMutableBuilder[Self <: Parts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParts(value: js.Array[String]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsVarargs(value: String*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
