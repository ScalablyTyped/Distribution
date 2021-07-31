package typings.keyvPostgres

import typings.keyv.mod.Store
import typings.keyvPostgres.keyvPostgresBooleans.`false`
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keyv/postgres", JSImport.Namespace)
  @js.native
  class ^ () extends KeyvPostgres {
    def this(options: Options) = this()
  }
  
  @js.native
  trait KeyvPostgres
    extends EventEmitter
       with Store[js.UndefOr[String]] {
    
    var namespace: js.UndefOr[String] = js.native
    
    def set(key: String): js.Promise[js.Any] = js.native
    def set(key: String, value: String): js.Promise[js.Any] = js.native
    
    val ttlSupport: `false` = js.native
  }
  
  trait Options extends StObject {
    
    var keySize: js.UndefOr[Double] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
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
      def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
