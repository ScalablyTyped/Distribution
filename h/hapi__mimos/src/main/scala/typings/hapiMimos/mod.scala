package typings.hapiMimos

import org.scalablytyped.runtime.StringDictionary
import typings.hapiMimos.anon.MimosOptionsValuepredicat
import typings.mimeDb.mod.MimeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/mimos", JSImport.Namespace)
  @js.native
  /**
    * Creates a new Mimos object.
    */
  class ^ ()
    extends StObject
       with Mimos {
    def this(options: MimosOptions) = this()
    
    /**
      * Returns mime object
      */
    /* CompleteClass */
    override def path(path: String): MimosOptionsValue = js.native
    
    /**
      * Returns mime object
      */
    /* CompleteClass */
    override def `type`(`type`: String): MimeEntry = js.native
  }
  
  trait Mimos extends StObject {
    
    /**
      * Returns mime object
      */
    def path(path: String): MimosOptionsValue
    
    /**
      * Returns mime object
      */
    def `type`(`type`: String): MimeEntry
  }
  object Mimos {
    
    @scala.inline
    def apply(path: String => MimosOptionsValue, `type`: String => MimeEntry): Mimos = {
      val __obj = js.Dynamic.literal(path = js.Any.fromFunction1(path))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Mimos]
    }
    
    @scala.inline
    implicit class MimosMutableBuilder[Self <: Mimos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String => MimosOptionsValue): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: String => MimeEntry): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    }
  }
  
  /**
    *
    * @see {@link https://github.com/hapijs/mimos#new-mimosoptions}
    */
  trait MimosOptions extends StObject {
    
    /**
      * an object hash that is merged into the built in mime information specified here {@link https://github.com/jshttp/mime-db}.
      * Each key value pair represents a single mime object.
      * Each override value should follow this schema:
      *  * the key is the lower-cased correct mime-type. (Ex. "application/javascript").
      *  * the value should an object @see MimosOptionsValue
      */
    var `override`: StringDictionary[MimosOptionsValuepredicat]
  }
  object MimosOptions {
    
    @scala.inline
    def apply(`override`: StringDictionary[MimosOptionsValuepredicat]): MimosOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MimosOptions]
    }
    
    @scala.inline
    implicit class MimosOptionsMutableBuilder[Self <: MimosOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverride(value: StringDictionary[MimosOptionsValuepredicat]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    }
  }
  
  trait MimosOptionsValue
    extends StObject
       with MimeEntry {
    
    /**
      * Specify the type value of result objects, defaults to key.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MimosOptionsValue {
    
    @scala.inline
    def apply(): MimosOptionsValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimosOptionsValue]
    }
    
    @scala.inline
    implicit class MimosOptionsValueMutableBuilder[Self <: MimosOptionsValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
