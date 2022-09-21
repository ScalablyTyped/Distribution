package typings.intlifyVueDevtools

import typings.intlifyShared.mod.Emittable
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`compile-error`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-compilation`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-evaluation`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-resolve`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-devtools-plugin-vue-i18n`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-i18n-resource-inspector`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-i18n-timeline`
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.fallback
import typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.missing
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@intlify/vue-devtools", "VueDevToolsLabels")
  @js.native
  val VueDevToolsLabels: Record[String, String] = js.native
  
  @JSImport("@intlify/vue-devtools", "VueDevToolsPlaceholders")
  @js.native
  val VueDevToolsPlaceholders: Record[String, String] = js.native
  
  @JSImport("@intlify/vue-devtools", "VueDevToolsTimelineColors")
  @js.native
  val VueDevToolsTimelineColors: Record[String, Double] = js.native
  
  type VueDevToolsEmitter = Emittable[VueDevToolsEmitterEvents]
  
  @js.native
  trait VueDevToolsEmitterEvents extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-devtools-plugin-vue-i18n`
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-i18n-resource-inspector`
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`vue-i18n-timeline`
  */
  trait VueDevToolsIDs extends StObject
  object VueDevToolsIDs {
    
    inline def CUSTOM_INSPECTOR: `vue-i18n-resource-inspector` = "vue-i18n-resource-inspector".asInstanceOf[`vue-i18n-resource-inspector`]
    
    inline def PLUGIN: `vue-devtools-plugin-vue-i18n` = "vue-devtools-plugin-vue-i18n".asInstanceOf[`vue-devtools-plugin-vue-i18n`]
    
    inline def TIMELINE: `vue-i18n-timeline` = "vue-i18n-timeline".asInstanceOf[`vue-i18n-timeline`]
  }
  
  @js.native
  trait VueDevToolsTimelineEventPayloads extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`compile-error`
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.missing
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.fallback
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-resolve`
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-compilation`
    - typings.intlifyVueDevtools.intlifyVueDevtoolsStrings.`message-evaluation`
  */
  trait VueDevToolsTimelineEvents extends StObject
  object VueDevToolsTimelineEvents {
    
    inline def COMPILE_ERROR: `compile-error` = "compile-error".asInstanceOf[`compile-error`]
    
    inline def FALBACK: fallback = "fallback".asInstanceOf[fallback]
    
    inline def MESSAGE_COMPILATION: `message-compilation` = "message-compilation".asInstanceOf[`message-compilation`]
    
    inline def MESSAGE_EVALUATION: `message-evaluation` = "message-evaluation".asInstanceOf[`message-evaluation`]
    
    inline def MESSAGE_RESOLVE: `message-resolve` = "message-resolve".asInstanceOf[`message-resolve`]
    
    inline def MISSING: missing = "missing".asInstanceOf[missing]
  }
}
