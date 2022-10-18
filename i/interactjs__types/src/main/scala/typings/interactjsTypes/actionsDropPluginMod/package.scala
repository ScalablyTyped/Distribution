package typings.interactjsTypes.actionsDropPluginMod

import typings.interactjsTypes.actionsDropPluginMod.^
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreTypesMod.Element
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
