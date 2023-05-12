package typings.gorillaEngine.GorillaEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instrument property
  */
trait InstrumentProperty extends StObject {
  
  val category: String
  
  val defaultValue: Double
  
  val key: String
  
  val label: String
  
  val maxValue: Double
  
  val minValue: Double
  
  val name: String
  
  /**
    * A normalised representation of its value.
    */
  var normValue: Double
  
  var normValueAsync: Double
  
  /**
    *  The number of its steps if it's a stepped parameter
    */
  val numSteps: Double
  
  val persistence: InstrumentPropertyPersistence
  
  val resolution: Double
  
  /**
    * Its steps if it's a stepped paramter
    */
  val steps: js.Array[String]
  
  val text: String
  
  val unit: String
  
  /**
    * Its actual value.
    */
  var value: Double
  
  var valueAsync: Double
}
object InstrumentProperty {
  
  inline def apply(
    category: String,
    defaultValue: Double,
    key: String,
    label: String,
    maxValue: Double,
    minValue: Double,
    name: String,
    normValue: Double,
    normValueAsync: Double,
    numSteps: Double,
    persistence: InstrumentPropertyPersistence,
    resolution: Double,
    steps: js.Array[String],
    text: String,
    unit: String,
    value: Double,
    valueAsync: Double
  ): InstrumentProperty = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normValue = normValue.asInstanceOf[js.Any], normValueAsync = normValueAsync.asInstanceOf[js.Any], numSteps = numSteps.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsync = valueAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstrumentProperty] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNormValue(value: Double): Self = StObject.set(x, "normValue", value.asInstanceOf[js.Any])
    
    inline def setNormValueAsync(value: Double): Self = StObject.set(x, "normValueAsync", value.asInstanceOf[js.Any])
    
    inline def setNumSteps(value: Double): Self = StObject.set(x, "numSteps", value.asInstanceOf[js.Any])
    
    inline def setPersistence(value: InstrumentPropertyPersistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[String]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: String*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueAsync(value: Double): Self = StObject.set(x, "valueAsync", value.asInstanceOf[js.Any])
  }
}
