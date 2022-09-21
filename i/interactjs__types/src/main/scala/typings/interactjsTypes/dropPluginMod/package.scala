package typings.interactjsTypes.dropPluginMod

import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.dropPluginMod.^
import typings.interactjsTypes.scopeMod.Plugin
import typings.interactjsTypes.typesMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: Plugin = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[Plugin]

type DropFunctionChecker = js.Function7[
/* dragEvent */ Any, 
/* event */ Any, 
/* dropped */ Boolean, 
/* dropzone */ InteractableActions, 
/* dropElement */ Element, 
/* draggable */ InteractableActions, 
/* draggableElement */ Element, 
Boolean]
