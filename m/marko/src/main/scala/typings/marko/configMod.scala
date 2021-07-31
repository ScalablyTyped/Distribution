package typings.marko

import typings.marko.markoStrings.html
import typings.marko.markoStrings.vdom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  trait Config extends StObject {
    
    var assumeUpToDate: js.UndefOr[Boolean] = js.undefined
    
    var autoKeyEnabled: js.UndefOr[Boolean] = js.undefined
    
    var checkUpToDate: js.UndefOr[Boolean] = js.undefined
    
    var escapeAtTags: js.UndefOr[Boolean] = js.undefined
    
    var ignoreUnrecognizedTags: js.UndefOr[Boolean] = js.undefined
    
    var output: js.UndefOr[vdom | html] = js.undefined
    
    var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var writeToDisk: js.UndefOr[Boolean] = js.undefined
    
    var writeVersionComment: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssumeUpToDate(value: Boolean): Self = StObject.set(x, "assumeUpToDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssumeUpToDateUndefined: Self = StObject.set(x, "assumeUpToDate", js.undefined)
      
      @scala.inline
      def setAutoKeyEnabled(value: Boolean): Self = StObject.set(x, "autoKeyEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoKeyEnabledUndefined: Self = StObject.set(x, "autoKeyEnabled", js.undefined)
      
      @scala.inline
      def setCheckUpToDate(value: Boolean): Self = StObject.set(x, "checkUpToDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUpToDateUndefined: Self = StObject.set(x, "checkUpToDate", js.undefined)
      
      @scala.inline
      def setEscapeAtTags(value: Boolean): Self = StObject.set(x, "escapeAtTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeAtTagsUndefined: Self = StObject.set(x, "escapeAtTags", js.undefined)
      
      @scala.inline
      def setIgnoreUnrecognizedTags(value: Boolean): Self = StObject.set(x, "ignoreUnrecognizedTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUnrecognizedTagsUndefined: Self = StObject.set(x, "ignoreUnrecognizedTags", js.undefined)
      
      @scala.inline
      def setOutput(value: vdom | html): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      @scala.inline
      def setWriteToDisk(value: Boolean): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
      
      @scala.inline
      def setWriteVersionComment(value: Boolean): Self = StObject.set(x, "writeVersionComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteVersionCommentUndefined: Self = StObject.set(x, "writeVersionComment", js.undefined)
    }
  }
}
