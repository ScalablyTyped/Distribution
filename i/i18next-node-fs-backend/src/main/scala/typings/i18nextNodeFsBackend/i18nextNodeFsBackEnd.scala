package typings.i18nextNodeFsBackend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nextNodeFsBackEnd {
  
  /**
    * @summary Options for "i18next".
    * @interface
    */
  trait I18nextOptions extends StObject {
    
    var backend: js.UndefOr[i18nextNodeFsBackEndOptions] = js.undefined
  }
  object I18nextOptions {
    
    @scala.inline
    def apply(): I18nextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[I18nextOptions]
    }
    
    @scala.inline
    implicit class I18nextOptionsMutableBuilder[Self <: I18nextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackend(value: i18nextNodeFsBackEndOptions): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendUndefined: Self = StObject.set(x, "backend", js.undefined)
    }
  }
  
  /**
    * @summary Options for "i18next-node-fs-backend".
    * @interface
    */
  trait i18nextNodeFsBackEndOptions extends StObject {
    
    /**
      * @summary Path to post missing resources
      * @type {string}
      */
    var addPath: String
    
    /**
      * @summary jsonIndent to use when storing json files
      * @type {number}
      */
    var jsonIndent: Double
    
    /**
      * @summary Path where resources get loaded from.
      * @type {string}
      */
    var loadPath: String
    
    /**
      * @summary custom parser
      * @type {function}
      */
    var parse: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
  }
  object i18nextNodeFsBackEndOptions {
    
    @scala.inline
    def apply(addPath: String, jsonIndent: Double, loadPath: String): i18nextNodeFsBackEndOptions = {
      val __obj = js.Dynamic.literal(addPath = addPath.asInstanceOf[js.Any], jsonIndent = jsonIndent.asInstanceOf[js.Any], loadPath = loadPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[i18nextNodeFsBackEndOptions]
    }
    
    @scala.inline
    implicit class i18nextNodeFsBackEndOptionsMutableBuilder[Self <: i18nextNodeFsBackEndOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddPath(value: String): Self = StObject.set(x, "addPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonIndent(value: Double): Self = StObject.set(x, "jsonIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadPath(value: String): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    }
  }
}
