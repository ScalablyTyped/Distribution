package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Position defines a position within a collection of data.  The value can be
  * either the end position, a key (used with ordered collections), a byte
  * offset, or a record index.
  */
trait SchemaPosition extends StObject {
  
  /**
    * Position is a byte offset.
    */
  var byteOffset: js.UndefOr[String] = js.undefined
  
  /**
    * CloudPosition is a concat position.
    */
  var concatPosition: js.UndefOr[SchemaConcatPosition] = js.undefined
  
  /**
    * Position is past all other positions. Also useful for the end position of
    * an unbounded range.
    */
  var end: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Position is a string key, ordered lexicographically.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Position is a record index.
    */
  var recordIndex: js.UndefOr[String] = js.undefined
  
  /**
    * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED
    * sharding).
    */
  var shufflePosition: js.UndefOr[String] = js.undefined
}
object SchemaPosition {
  
  inline def apply(): SchemaPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosition]
  }
  
  extension [Self <: SchemaPosition](x: Self) {
    
    inline def setByteOffset(value: String): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
    
    inline def setByteOffsetUndefined: Self = StObject.set(x, "byteOffset", js.undefined)
    
    inline def setConcatPosition(value: SchemaConcatPosition): Self = StObject.set(x, "concatPosition", value.asInstanceOf[js.Any])
    
    inline def setConcatPositionUndefined: Self = StObject.set(x, "concatPosition", js.undefined)
    
    inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRecordIndex(value: String): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
    
    inline def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
    
    inline def setShufflePosition(value: String): Self = StObject.set(x, "shufflePosition", value.asInstanceOf[js.Any])
    
    inline def setShufflePositionUndefined: Self = StObject.set(x, "shufflePosition", js.undefined)
  }
}
