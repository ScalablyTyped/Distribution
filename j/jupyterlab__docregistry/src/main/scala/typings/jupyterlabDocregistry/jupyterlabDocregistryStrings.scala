package typings.jupyterlabDocregistry

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.SaveState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabDocregistryStrings {
  
  @js.native
  sealed trait added extends StObject
  inline def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait completed
    extends StObject
       with SaveState
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait failed
    extends StObject
       with SaveState
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fileType extends StObject
  inline def fileType: fileType = "fileType".asInstanceOf[fileType]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait modelFactory extends StObject
  inline def modelFactory: modelFactory = "modelFactory".asInstanceOf[modelFactory]
  
  @js.native
  sealed trait removed extends StObject
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait started
    extends StObject
       with SaveState
  inline def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait string extends StObject
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait widgetExtension extends StObject
  inline def widgetExtension: widgetExtension = "widgetExtension".asInstanceOf[widgetExtension]
  
  @js.native
  sealed trait widgetFactory extends StObject
  inline def widgetFactory: widgetFactory = "widgetFactory".asInstanceOf[widgetFactory]
}
