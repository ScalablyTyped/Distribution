package typings.matrixBotSdk

import typings.matrixBotSdk.matrixBotSdkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsMsc2176Mod {
  
  trait MSC2716BatchSendResponse extends StObject {
    
    /**
      * List of historical event IDs that were inserted
      */
    var events: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Chunk ID to be used in the next `sendHistoricalEventBatch` call.
      */
    var next_chunk_id: String
    
    /**
      * List of historical state event IDs that were inserted
      */
    var state_events: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MSC2716BatchSendResponse {
    
    inline def apply(next_chunk_id: String): MSC2716BatchSendResponse = {
      val __obj = js.Dynamic.literal(next_chunk_id = next_chunk_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSC2716BatchSendResponse]
    }
    
    extension [Self <: MSC2716BatchSendResponse](x: Self) {
      
      inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setNext_chunk_id(value: String): Self = StObject.set(x, "next_chunk_id", value.asInstanceOf[js.Any])
      
      inline def setState_events(value: js.Array[String]): Self = StObject.set(x, "state_events", value.asInstanceOf[js.Any])
      
      inline def setState_eventsUndefined: Self = StObject.set(x, "state_events", js.undefined)
      
      inline def setState_eventsVarargs(value: String*): Self = StObject.set(x, "state_events", js.Array(value*))
    }
  }
  
  trait MSC2716ChunkEventContent extends StObject {
    
    @JSName("org.matrix.msc2716.chunk_id")
    var orgDotmatrixDotmsc2716Dotchunk_id: String
    
    @JSName("org.matrix.msc2716.historical")
    var orgDotmatrixDotmsc2716Dothistorical: `true`
  }
  object MSC2716ChunkEventContent {
    
    inline def apply(orgDotmatrixDotmsc2716Dotchunk_id: String): MSC2716ChunkEventContent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("org.matrix.msc2716.chunk_id")(orgDotmatrixDotmsc2716Dotchunk_id.asInstanceOf[js.Any])
      __obj.updateDynamic("org.matrix.msc2716.historical")(true)
      __obj.asInstanceOf[MSC2716ChunkEventContent]
    }
    
    extension [Self <: MSC2716ChunkEventContent](x: Self) {
      
      inline def setOrgDotmatrixDotmsc2716Dotchunk_id(value: String): Self = StObject.set(x, "org.matrix.msc2716.chunk_id", value.asInstanceOf[js.Any])
      
      inline def setOrgDotmatrixDotmsc2716Dothistorical(value: `true`): Self = StObject.set(x, "org.matrix.msc2716.historical", value.asInstanceOf[js.Any])
    }
  }
  
  trait MSC2716InsertionEventContent extends StObject {
    
    @JSName("org.matrix.msc2716.historical")
    var orgDotmatrixDotmsc2716Dothistorical: `true`
    
    @JSName("org.matrix.msc2716.next_chunk_id")
    var orgDotmatrixDotmsc2716Dotnext_chunk_id: String
  }
  object MSC2716InsertionEventContent {
    
    inline def apply(orgDotmatrixDotmsc2716Dotnext_chunk_id: String): MSC2716InsertionEventContent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("org.matrix.msc2716.historical")(true)
      __obj.updateDynamic("org.matrix.msc2716.next_chunk_id")(orgDotmatrixDotmsc2716Dotnext_chunk_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSC2716InsertionEventContent]
    }
    
    extension [Self <: MSC2716InsertionEventContent](x: Self) {
      
      inline def setOrgDotmatrixDotmsc2716Dothistorical(value: `true`): Self = StObject.set(x, "org.matrix.msc2716.historical", value.asInstanceOf[js.Any])
      
      inline def setOrgDotmatrixDotmsc2716Dotnext_chunk_id(value: String): Self = StObject.set(x, "org.matrix.msc2716.next_chunk_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait MSC2716MarkerEventContent extends StObject {
    
    @JSName("org.matrix.msc2716.historical")
    var orgDotmatrixDotmsc2716Dothistorical: `true`
    
    @JSName("org.matrix.msc2716.insertion_id")
    var orgDotmatrixDotmsc2716Dotinsertion_id: String
  }
  object MSC2716MarkerEventContent {
    
    inline def apply(orgDotmatrixDotmsc2716Dotinsertion_id: String): MSC2716MarkerEventContent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("org.matrix.msc2716.historical")(true)
      __obj.updateDynamic("org.matrix.msc2716.insertion_id")(orgDotmatrixDotmsc2716Dotinsertion_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSC2716MarkerEventContent]
    }
    
    extension [Self <: MSC2716MarkerEventContent](x: Self) {
      
      inline def setOrgDotmatrixDotmsc2716Dothistorical(value: `true`): Self = StObject.set(x, "org.matrix.msc2716.historical", value.asInstanceOf[js.Any])
      
      inline def setOrgDotmatrixDotmsc2716Dotinsertion_id(value: String): Self = StObject.set(x, "org.matrix.msc2716.insertion_id", value.asInstanceOf[js.Any])
    }
  }
}
