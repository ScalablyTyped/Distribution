package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutsParam extends StObject {
  
  def addLayout(name: String, serializerGenerator: LayoutFunction): Unit
  
  def basicLayout(loggingEvent: LoggingEvent): String
  @JSName("basicLayout")
  var basicLayout_Original: LayoutFunction
  
  def coloredLayout(loggingEvent: LoggingEvent): String
  @JSName("coloredLayout")
  var coloredLayout_Original: LayoutFunction
  
  def colouredLayout(loggingEvent: LoggingEvent): String
  @JSName("colouredLayout")
  var colouredLayout_Original: LayoutFunction
  
  def dummyLayout(loggingEvent: LoggingEvent): String
  @JSName("dummyLayout")
  var dummyLayout_Original: LayoutFunction
  
  def layout(name: String, config: PatternToken): LayoutFunction
  
  def messagePassThroughLayout(loggingEvent: LoggingEvent): String
  @JSName("messagePassThroughLayout")
  var messagePassThroughLayout_Original: LayoutFunction
  
  def patternLayout(loggingEvent: LoggingEvent): String
  @JSName("patternLayout")
  var patternLayout_Original: LayoutFunction
}
object LayoutsParam {
  
  inline def apply(
    addLayout: (String, LayoutFunction) => Unit,
    basicLayout: /* loggingEvent */ LoggingEvent => String,
    coloredLayout: /* loggingEvent */ LoggingEvent => String,
    colouredLayout: /* loggingEvent */ LoggingEvent => String,
    dummyLayout: /* loggingEvent */ LoggingEvent => String,
    layout: (String, PatternToken) => LayoutFunction,
    messagePassThroughLayout: /* loggingEvent */ LoggingEvent => String,
    patternLayout: /* loggingEvent */ LoggingEvent => String
  ): LayoutsParam = {
    val __obj = js.Dynamic.literal(addLayout = js.Any.fromFunction2(addLayout), basicLayout = js.Any.fromFunction1(basicLayout), coloredLayout = js.Any.fromFunction1(coloredLayout), colouredLayout = js.Any.fromFunction1(colouredLayout), dummyLayout = js.Any.fromFunction1(dummyLayout), layout = js.Any.fromFunction2(layout), messagePassThroughLayout = js.Any.fromFunction1(messagePassThroughLayout), patternLayout = js.Any.fromFunction1(patternLayout))
    __obj.asInstanceOf[LayoutsParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutsParam] (val x: Self) extends AnyVal {
    
    inline def setAddLayout(value: (String, LayoutFunction) => Unit): Self = StObject.set(x, "addLayout", js.Any.fromFunction2(value))
    
    inline def setBasicLayout(value: /* loggingEvent */ LoggingEvent => String): Self = StObject.set(x, "basicLayout", js.Any.fromFunction1(value))
    
    inline def setColoredLayout(value: /* loggingEvent */ LoggingEvent => String): Self = StObject.set(x, "coloredLayout", js.Any.fromFunction1(value))
    
    inline def setColouredLayout(value: /* loggingEvent */ LoggingEvent => String): Self = StObject.set(x, "colouredLayout", js.Any.fromFunction1(value))
    
    inline def setDummyLayout(value: /* loggingEvent */ LoggingEvent => String): Self = StObject.set(x, "dummyLayout", js.Any.fromFunction1(value))
    
    inline def setLayout(value: (String, PatternToken) => LayoutFunction): Self = StObject.set(x, "layout", js.Any.fromFunction2(value))
    
    inline def setMessagePassThroughLayout(value: /* loggingEvent */ LoggingEvent => String): Self = StObject.set(x, "messagePassThroughLayout", js.Any.fromFunction1(value))
    
    inline def setPatternLayout(value: /* loggingEvent */ LoggingEvent => String): Self = StObject.set(x, "patternLayout", js.Any.fromFunction1(value))
  }
}
