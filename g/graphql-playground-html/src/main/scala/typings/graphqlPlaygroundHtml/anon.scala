package typings.graphqlPlaygroundHtml

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlPlaygroundHtml.renderPlaygroundPageMod.CursorShape
import typings.graphqlPlaygroundHtml.renderPlaygroundPageMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Container extends StObject {
    
    var container: String
    
    var script: String
  }
  object Container {
    
    inline def apply(container: String, script: String): Container = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<graphql-playground-html.graphql-playground-html/dist/render-playground-page.ISettings> */
  trait PartialISettings extends StObject {
    
    @JSName("editor.cursorShape")
    var editorDotcursorShape: js.UndefOr[CursorShape] = js.undefined
    
    @JSName("editor.fontFamily")
    var editorDotfontFamily: js.UndefOr[String] = js.undefined
    
    @JSName("editor.fontSize")
    var editorDotfontSize: js.UndefOr[Double] = js.undefined
    
    @JSName("editor.reuseHeaders")
    var editorDotreuseHeaders: js.UndefOr[Boolean] = js.undefined
    
    @JSName("editor.theme")
    var editorDottheme: js.UndefOr[Theme] = js.undefined
    
    @JSName("general.betaUpdates")
    var generalDotbetaUpdates: js.UndefOr[Boolean] = js.undefined
    
    @JSName("request.credentials")
    var requestDotcredentials: js.UndefOr[String] = js.undefined
    
    @JSName("request.globalHeaders")
    var requestDotglobalHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
    
    @JSName("schema.polling.enable")
    var schemaDotpollingDotenable: js.UndefOr[Boolean] = js.undefined
    
    @JSName("schema.polling.endpointFilter")
    var schemaDotpollingDotendpointFilter: js.UndefOr[String] = js.undefined
    
    @JSName("schema.polling.interval")
    var schemaDotpollingDotinterval: js.UndefOr[Double] = js.undefined
    
    @JSName("tracing.hideTracingResponse")
    var tracingDothideTracingResponse: js.UndefOr[Boolean] = js.undefined
    
    @JSName("tracing.tracingSupported")
    var tracingDottracingSupported: js.UndefOr[Boolean] = js.undefined
  }
  object PartialISettings {
    
    inline def apply(): PartialISettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialISettings]
    }
    
    extension [Self <: PartialISettings](x: Self) {
      
      inline def setEditorDotcursorShape(value: CursorShape): Self = StObject.set(x, "editor.cursorShape", value.asInstanceOf[js.Any])
      
      inline def setEditorDotcursorShapeUndefined: Self = StObject.set(x, "editor.cursorShape", js.undefined)
      
      inline def setEditorDotfontFamily(value: String): Self = StObject.set(x, "editor.fontFamily", value.asInstanceOf[js.Any])
      
      inline def setEditorDotfontFamilyUndefined: Self = StObject.set(x, "editor.fontFamily", js.undefined)
      
      inline def setEditorDotfontSize(value: Double): Self = StObject.set(x, "editor.fontSize", value.asInstanceOf[js.Any])
      
      inline def setEditorDotfontSizeUndefined: Self = StObject.set(x, "editor.fontSize", js.undefined)
      
      inline def setEditorDotreuseHeaders(value: Boolean): Self = StObject.set(x, "editor.reuseHeaders", value.asInstanceOf[js.Any])
      
      inline def setEditorDotreuseHeadersUndefined: Self = StObject.set(x, "editor.reuseHeaders", js.undefined)
      
      inline def setEditorDottheme(value: Theme): Self = StObject.set(x, "editor.theme", value.asInstanceOf[js.Any])
      
      inline def setEditorDotthemeUndefined: Self = StObject.set(x, "editor.theme", js.undefined)
      
      inline def setGeneralDotbetaUpdates(value: Boolean): Self = StObject.set(x, "general.betaUpdates", value.asInstanceOf[js.Any])
      
      inline def setGeneralDotbetaUpdatesUndefined: Self = StObject.set(x, "general.betaUpdates", js.undefined)
      
      inline def setRequestDotcredentials(value: String): Self = StObject.set(x, "request.credentials", value.asInstanceOf[js.Any])
      
      inline def setRequestDotcredentialsUndefined: Self = StObject.set(x, "request.credentials", js.undefined)
      
      inline def setRequestDotglobalHeaders(value: StringDictionary[String]): Self = StObject.set(x, "request.globalHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestDotglobalHeadersUndefined: Self = StObject.set(x, "request.globalHeaders", js.undefined)
      
      inline def setSchemaDotpollingDotenable(value: Boolean): Self = StObject.set(x, "schema.polling.enable", value.asInstanceOf[js.Any])
      
      inline def setSchemaDotpollingDotenableUndefined: Self = StObject.set(x, "schema.polling.enable", js.undefined)
      
      inline def setSchemaDotpollingDotendpointFilter(value: String): Self = StObject.set(x, "schema.polling.endpointFilter", value.asInstanceOf[js.Any])
      
      inline def setSchemaDotpollingDotendpointFilterUndefined: Self = StObject.set(x, "schema.polling.endpointFilter", js.undefined)
      
      inline def setSchemaDotpollingDotinterval(value: Double): Self = StObject.set(x, "schema.polling.interval", value.asInstanceOf[js.Any])
      
      inline def setSchemaDotpollingDotintervalUndefined: Self = StObject.set(x, "schema.polling.interval", js.undefined)
      
      inline def setTracingDothideTracingResponse(value: Boolean): Self = StObject.set(x, "tracing.hideTracingResponse", value.asInstanceOf[js.Any])
      
      inline def setTracingDothideTracingResponseUndefined: Self = StObject.set(x, "tracing.hideTracingResponse", js.undefined)
      
      inline def setTracingDottracingSupported(value: Boolean): Self = StObject.set(x, "tracing.tracingSupported", value.asInstanceOf[js.Any])
      
      inline def setTracingDottracingSupportedUndefined: Self = StObject.set(x, "tracing.tracingSupported", js.undefined)
    }
  }
}
