package typings.luxon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IncludeConfig extends StObject {
    
    var includeConfig: js.UndefOr[Boolean] = js.undefined
  }
  object IncludeConfig {
    
    @scala.inline
    def apply(): IncludeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeConfig]
    }
    
    @scala.inline
    implicit class IncludeConfigMutableBuilder[Self <: IncludeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeConfig(value: Boolean): Self = StObject.set(x, "includeConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeConfigUndefined: Self = StObject.set(x, "includeConfig", js.undefined)
    }
  }
  
  trait Literal extends StObject {
    
    var literal: Boolean
    
    var `val`: String
  }
  object Literal {
    
    @scala.inline
    def apply(literal: Boolean, `val`: String): Literal = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
    
    @scala.inline
    implicit class LiteralMutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  trait Separator extends StObject {
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object Separator {
    
    @scala.inline
    def apply(): Separator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Separator]
    }
    
    @scala.inline
    implicit class SeparatorMutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
