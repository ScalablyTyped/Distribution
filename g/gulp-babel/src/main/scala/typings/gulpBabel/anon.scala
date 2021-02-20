package typings.gulpBabel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ast extends StObject {
    
    var ast: js.UndefOr[Boolean] = js.native
    
    var auxiliaryCommentAfter: js.UndefOr[js.Any] = js.native
    
    var auxiliaryCommentBefore: js.UndefOr[js.Any] = js.native
    
    var code: js.UndefOr[Boolean] = js.native
    
    var comments: js.UndefOr[Boolean] = js.native
    
    var compact: js.UndefOr[js.Any] = js.native
    
    var env: js.UndefOr[js.Any] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var filenameRelative: js.UndefOr[String] = js.native
    
    var getModuleId: js.UndefOr[js.Any] = js.native
    
    var highlightCode: js.UndefOr[Boolean] = js.native
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.native
    
    var inputSourceMap: js.UndefOr[js.Any] = js.native
    
    var keepModuleIdExtesions: js.UndefOr[Boolean] = js.native
    
    var moduleId: js.UndefOr[js.Any] = js.native
    
    var moduleIds: js.UndefOr[js.Any] = js.native
    
    var moduleRoot: js.UndefOr[js.Any] = js.native
    
    var only: js.UndefOr[String | js.Array[String]] = js.native
    
    var plugins: js.UndefOr[js.Array[String]] = js.native
    
    var presets: js.UndefOr[js.Array[String]] = js.native
    
    var resolveModuleSource: js.UndefOr[js.Any] = js.native
    
    var retainLines: js.UndefOr[Boolean] = js.native
    
    var shouldPrintComment: js.UndefOr[js.Any] = js.native
    
    var sourceFileName: js.UndefOr[js.Any] = js.native
    
    var sourceMapTarget: js.UndefOr[js.Any] = js.native
    
    var sourceMaps: js.UndefOr[js.Any] = js.native
    
    var sourceRoot: js.UndefOr[js.Any] = js.native
  }
  object Ast {
    
    @scala.inline
    def apply(): Ast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ast]
    }
    
    @scala.inline
    implicit class AstMutableBuilder[Self <: Ast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAst(value: Boolean): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      @scala.inline
      def setAuxiliaryCommentAfter(value: js.Any): Self = StObject.set(x, "auxiliaryCommentAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxiliaryCommentAfterUndefined: Self = StObject.set(x, "auxiliaryCommentAfter", js.undefined)
      
      @scala.inline
      def setAuxiliaryCommentBefore(value: js.Any): Self = StObject.set(x, "auxiliaryCommentBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxiliaryCommentBeforeUndefined: Self = StObject.set(x, "auxiliaryCommentBefore", js.undefined)
      
      @scala.inline
      def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setComments(value: Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setCompact(value: js.Any): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameRelative(value: String): Self = StObject.set(x, "filenameRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameRelativeUndefined: Self = StObject.set(x, "filenameRelative", js.undefined)
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setGetModuleId(value: js.Any): Self = StObject.set(x, "getModuleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetModuleIdUndefined: Self = StObject.set(x, "getModuleId", js.undefined)
      
      @scala.inline
      def setHighlightCode(value: Boolean): Self = StObject.set(x, "highlightCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightCodeUndefined: Self = StObject.set(x, "highlightCode", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setInputSourceMap(value: js.Any): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      @scala.inline
      def setKeepModuleIdExtesions(value: Boolean): Self = StObject.set(x, "keepModuleIdExtesions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepModuleIdExtesionsUndefined: Self = StObject.set(x, "keepModuleIdExtesions", js.undefined)
      
      @scala.inline
      def setModuleId(value: js.Any): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
      
      @scala.inline
      def setModuleIds(value: js.Any): Self = StObject.set(x, "moduleIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleIdsUndefined: Self = StObject.set(x, "moduleIds", js.undefined)
      
      @scala.inline
      def setModuleRoot(value: js.Any): Self = StObject.set(x, "moduleRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleRootUndefined: Self = StObject.set(x, "moduleRoot", js.undefined)
      
      @scala.inline
      def setOnly(value: String | js.Array[String]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value :_*))
      
      @scala.inline
      def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setPresets(value: js.Array[String]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPresetsVarargs(value: String*): Self = StObject.set(x, "presets", js.Array(value :_*))
      
      @scala.inline
      def setResolveModuleSource(value: js.Any): Self = StObject.set(x, "resolveModuleSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveModuleSourceUndefined: Self = StObject.set(x, "resolveModuleSource", js.undefined)
      
      @scala.inline
      def setRetainLines(value: Boolean): Self = StObject.set(x, "retainLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainLinesUndefined: Self = StObject.set(x, "retainLines", js.undefined)
      
      @scala.inline
      def setShouldPrintComment(value: js.Any): Self = StObject.set(x, "shouldPrintComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldPrintCommentUndefined: Self = StObject.set(x, "shouldPrintComment", js.undefined)
      
      @scala.inline
      def setSourceFileName(value: js.Any): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      @scala.inline
      def setSourceMapTarget(value: js.Any): Self = StObject.set(x, "sourceMapTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapTargetUndefined: Self = StObject.set(x, "sourceMapTarget", js.undefined)
      
      @scala.inline
      def setSourceMaps(value: js.Any): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: js.Any): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    }
  }
}
