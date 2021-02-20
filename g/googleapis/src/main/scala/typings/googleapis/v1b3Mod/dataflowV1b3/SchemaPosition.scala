package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Position defines a position within a collection of data.  The value can be
  * either the end position, a key (used with ordered collections), a byte
  * offset, or a record index.
  */
@js.native
trait SchemaPosition extends StObject {
  
  /**
    * Position is a byte offset.
    */
  var byteOffset: js.UndefOr[String] = js.native
  
  /**
    * CloudPosition is a concat position.
    */
  var concatPosition: js.UndefOr[SchemaConcatPosition] = js.native
  
  /**
    * Position is past all other positions. Also useful for the end position of
    * an unbounded range.
    */
  var end: js.UndefOr[Boolean] = js.native
  
  /**
    * Position is a string key, ordered lexicographically.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Position is a record index.
    */
  var recordIndex: js.UndefOr[String] = js.native
  
  /**
    * CloudPosition is a base64 encoded BatchShufflePosition (with FIXED
    * sharding).
    */
  var shufflePosition: js.UndefOr[String] = js.native
}
object SchemaPosition {
  
  @scala.inline
  def apply(): SchemaPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosition]
  }
  
  @scala.inline
  implicit class SchemaPositionMutableBuilder[Self <: SchemaPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteOffset(value: String): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteOffsetUndefined: Self = StObject.set(x, "byteOffset", js.undefined)
    
    @scala.inline
    def setConcatPosition(value: SchemaConcatPosition): Self = StObject.set(x, "concatPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcatPositionUndefined: Self = StObject.set(x, "concatPosition", js.undefined)
    
    @scala.inline
    def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRecordIndex(value: String): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
    
    @scala.inline
    def setShufflePosition(value: String): Self = StObject.set(x, "shufflePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShufflePositionUndefined: Self = StObject.set(x, "shufflePosition", js.undefined)
  }
}
