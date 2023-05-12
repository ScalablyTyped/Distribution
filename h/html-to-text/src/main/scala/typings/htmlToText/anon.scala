package typings.htmlToText

import typings.htmlToText.mod.FormatCallback
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Formatters extends StObject {
    
    var formatters: Record[String, FormatCallback]
  }
  object Formatters {
    
    inline def apply(formatters: Record[String, FormatCallback]): Formatters = {
      val __obj = js.Dynamic.literal(formatters = formatters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Formatters] (val x: Self) extends AnyVal {
      
      inline def setFormatters(value: Record[String, FormatCallback]): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prefix extends StObject {
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Prefix {
    
    inline def apply(): Prefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Prefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait TrailingLineBreaks extends StObject {
    
    var trailingLineBreaks: js.UndefOr[Double] = js.undefined
  }
  object TrailingLineBreaks {
    
    inline def apply(): TrailingLineBreaks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrailingLineBreaks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrailingLineBreaks] (val x: Self) extends AnyVal {
      
      inline def setTrailingLineBreaks(value: Double): Self = StObject.set(x, "trailingLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setTrailingLineBreaksUndefined: Self = StObject.set(x, "trailingLineBreaks", js.undefined)
    }
  }
}
