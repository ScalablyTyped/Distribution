package typings.keyvMongo

import typings.keyv.mod.Store
import typings.keyvMongo.keyvMongoBooleans.`false`
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keyv/mongo", JSImport.Namespace)
  @js.native
  class ^[TValue] () extends KeyvMongo[TValue] {
    def this(options: Options) = this()
    def this(uri: String) = this()
  }
  
  @js.native
  trait KeyvMongo[TValue]
    extends EventEmitter
       with Store[TValue] {
    
    var namespace: js.UndefOr[String] = js.native
    
    val ttlSupport: `false` = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var collection: js.UndefOr[String] = js.native
    
    var uri: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
