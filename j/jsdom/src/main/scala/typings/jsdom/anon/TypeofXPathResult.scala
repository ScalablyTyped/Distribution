package typings.jsdom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofXPathResult extends StObject {
  
  /* standard dom */
  val ANY_TYPE: Double
  
  /* standard dom */
  val ANY_UNORDERED_NODE_TYPE: Double
  
  /* standard dom */
  val BOOLEAN_TYPE: Double
  
  /* standard dom */
  val FIRST_ORDERED_NODE_TYPE: Double
  
  /* standard dom */
  val NUMBER_TYPE: Double
  
  /* standard dom */
  val ORDERED_NODE_ITERATOR_TYPE: Double
  
  /* standard dom */
  val ORDERED_NODE_SNAPSHOT_TYPE: Double
  
  /* standard dom */
  val STRING_TYPE: Double
  
  /* standard dom */
  val UNORDERED_NODE_ITERATOR_TYPE: Double
  
  /* standard dom */
  val UNORDERED_NODE_SNAPSHOT_TYPE: Double
}
object TypeofXPathResult {
  
  inline def apply(
    ANY_TYPE: Double,
    ANY_UNORDERED_NODE_TYPE: Double,
    BOOLEAN_TYPE: Double,
    FIRST_ORDERED_NODE_TYPE: Double,
    NUMBER_TYPE: Double,
    ORDERED_NODE_ITERATOR_TYPE: Double,
    ORDERED_NODE_SNAPSHOT_TYPE: Double,
    STRING_TYPE: Double,
    UNORDERED_NODE_ITERATOR_TYPE: Double,
    UNORDERED_NODE_SNAPSHOT_TYPE: Double
  ): TypeofXPathResult = {
    val __obj = js.Dynamic.literal(ANY_TYPE = ANY_TYPE.asInstanceOf[js.Any], ANY_UNORDERED_NODE_TYPE = ANY_UNORDERED_NODE_TYPE.asInstanceOf[js.Any], BOOLEAN_TYPE = BOOLEAN_TYPE.asInstanceOf[js.Any], FIRST_ORDERED_NODE_TYPE = FIRST_ORDERED_NODE_TYPE.asInstanceOf[js.Any], NUMBER_TYPE = NUMBER_TYPE.asInstanceOf[js.Any], ORDERED_NODE_ITERATOR_TYPE = ORDERED_NODE_ITERATOR_TYPE.asInstanceOf[js.Any], ORDERED_NODE_SNAPSHOT_TYPE = ORDERED_NODE_SNAPSHOT_TYPE.asInstanceOf[js.Any], STRING_TYPE = STRING_TYPE.asInstanceOf[js.Any], UNORDERED_NODE_ITERATOR_TYPE = UNORDERED_NODE_ITERATOR_TYPE.asInstanceOf[js.Any], UNORDERED_NODE_SNAPSHOT_TYPE = UNORDERED_NODE_SNAPSHOT_TYPE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofXPathResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofXPathResult] (val x: Self) extends AnyVal {
    
    inline def setANY_TYPE(value: Double): Self = StObject.set(x, "ANY_TYPE", value.asInstanceOf[js.Any])
    
    inline def setANY_UNORDERED_NODE_TYPE(value: Double): Self = StObject.set(x, "ANY_UNORDERED_NODE_TYPE", value.asInstanceOf[js.Any])
    
    inline def setBOOLEAN_TYPE(value: Double): Self = StObject.set(x, "BOOLEAN_TYPE", value.asInstanceOf[js.Any])
    
    inline def setFIRST_ORDERED_NODE_TYPE(value: Double): Self = StObject.set(x, "FIRST_ORDERED_NODE_TYPE", value.asInstanceOf[js.Any])
    
    inline def setNUMBER_TYPE(value: Double): Self = StObject.set(x, "NUMBER_TYPE", value.asInstanceOf[js.Any])
    
    inline def setORDERED_NODE_ITERATOR_TYPE(value: Double): Self = StObject.set(x, "ORDERED_NODE_ITERATOR_TYPE", value.asInstanceOf[js.Any])
    
    inline def setORDERED_NODE_SNAPSHOT_TYPE(value: Double): Self = StObject.set(x, "ORDERED_NODE_SNAPSHOT_TYPE", value.asInstanceOf[js.Any])
    
    inline def setSTRING_TYPE(value: Double): Self = StObject.set(x, "STRING_TYPE", value.asInstanceOf[js.Any])
    
    inline def setUNORDERED_NODE_ITERATOR_TYPE(value: Double): Self = StObject.set(x, "UNORDERED_NODE_ITERATOR_TYPE", value.asInstanceOf[js.Any])
    
    inline def setUNORDERED_NODE_SNAPSHOT_TYPE(value: Double): Self = StObject.set(x, "UNORDERED_NODE_SNAPSHOT_TYPE", value.asInstanceOf[js.Any])
  }
}
