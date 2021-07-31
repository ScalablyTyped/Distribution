package typings.libp2pInterfaces

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordMod {
  
  /**
    * Record is the base implementation of a record that can be used as the payload of a libp2p envelope.
    */
  @JSImport("libp2p-interfaces/src/record", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Record {
    /**
      * @constructor
      * @param {String} domain signature domain
      * @param {Uint8Array} codec identifier of the type of record
      */
    def this(domain: String, codec: Uint8Array) = this()
    
    /* CompleteClass */
    var codec: Uint8Array = js.native
    
    /* CompleteClass */
    var domain: String = js.native
    
    /**
      * Verifies if the other provided Record is identical to this one.
      * @param {Record} other
      */
    /* CompleteClass */
    override def equals(other: Record): Unit = js.native
    
    /**
      * Marshal a record to be used in an envelope.
      */
    /* CompleteClass */
    override def marshal(): Unit = js.native
  }
  
  /**
    * Record is the base implementation of a record that can be used as the payload of a libp2p envelope.
    */
  trait Record extends StObject {
    
    var codec: Uint8Array
    
    var domain: String
    
    /**
      * Verifies if the other provided Record is identical to this one.
      * @param {Record} other
      */
    def equals(other: Record): Unit
    
    /**
      * Marshal a record to be used in an envelope.
      */
    def marshal(): Unit
  }
  object Record {
    
    @scala.inline
    def apply(codec: Uint8Array, domain: String, equals_ : Record => Unit, marshal: () => Unit): Record = {
      val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], marshal = js.Any.fromFunction0(marshal))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Record]
    }
    
    @scala.inline
    implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodec(value: Uint8Array): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_(value: Record => Unit): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarshal(value: () => Unit): Self = StObject.set(x, "marshal", js.Any.fromFunction0(value))
    }
  }
}
