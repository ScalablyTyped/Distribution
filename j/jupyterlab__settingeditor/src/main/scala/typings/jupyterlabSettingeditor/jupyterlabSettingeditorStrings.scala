package typings.jupyterlabSettingeditor

import typings.jupyterlabSettingeditor.libSettingseditorMod.SettingsEditor.SaveState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabSettingeditorStrings {
  
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
  sealed trait started
    extends StObject
       with SaveState
  inline def started: started = "started".asInstanceOf[started]
}
