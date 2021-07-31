package typings.greasemonkey

import typings.greasemonkey.GM.ProgressResponse
import typings.greasemonkey.GM.Response
import typings.greasemonkey.GM.ScriptInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mimetype extends StObject {
    
    var mimetype: String
    
    var name: String
    
    var url: String
  }
  object Mimetype {
    
    @scala.inline
    def apply(mimetype: String, name: String, url: String): Mimetype = {
      val __obj = js.Dynamic.literal(mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mimetype]
    }
    
    @scala.inline
    implicit class MimetypeMutableBuilder[Self <: Mimetype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Onabort[TContext] extends StObject {
    
    var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
    
    var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.undefined
  }
  object Onabort {
    
    @scala.inline
    def apply[TContext](): Onabort[TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Onabort[TContext]]
    }
    
    @scala.inline
    implicit class OnabortMutableBuilder[Self <: Onabort[?], TContext] (val x: Self & Onabort[TContext]) extends AnyVal {
      
      @scala.inline
      def setOnabort(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      @scala.inline
      def setOnerror(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnload(value: /* response */ Response[TContext] => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setOnprogress(value: /* response */ ProgressResponse[TContext] => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    }
  }
  
  trait Script extends StObject {
    
    /** An object containing data about the currently running script */
    var script: ScriptInfo
    
    /**
      * The name of the user script engine handling this script's execution.
      * The string `Greasemonkey`
      */
    var scriptHandler: String
    
    /**
      * A string, the entire literal Metadata Block (without the delimiters)
      * for the currently running script
      */
    var scriptMetaStr: String
    
    /** The version of Greasemonkey, a string e.g. `4.0` */
    var version: String
  }
  object Script {
    
    @scala.inline
    def apply(script: ScriptInfo, scriptHandler: String, scriptMetaStr: String, version: String): Script = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any], scriptHandler = scriptHandler.asInstanceOf[js.Any], scriptMetaStr = scriptMetaStr.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Script]
    }
    
    @scala.inline
    implicit class ScriptMutableBuilder[Self <: Script] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScript(value: ScriptInfo): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptHandler(value: String): Self = StObject.set(x, "scriptHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptMetaStr(value: String): Self = StObject.set(x, "scriptMetaStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
