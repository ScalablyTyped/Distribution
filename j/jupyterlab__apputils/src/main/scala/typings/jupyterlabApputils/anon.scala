package typings.jupyterlabApputils

import typings.jupyterlabApputils.jupyterlabApputilsStrings.default
import typings.jupyterlabApputils.jupyterlabApputilsStrings.warn
import typings.jupyterlabApputils.libHoverboxMod.OutOfViewDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Above extends StObject {
    
    var above: js.UndefOr[Double] = js.undefined
    
    var below: js.UndefOr[Double] = js.undefined
  }
  object Above {
    
    inline def apply(): Above = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Above]
    }
    
    extension [Self <: Above](x: Self) {
      
      inline def setAbove(value: Double): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
      
      inline def setAboveUndefined: Self = StObject.set(x, "above", js.undefined)
      
      inline def setBelow(value: Double): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
      
      inline def setBelowUndefined: Self = StObject.set(x, "below", js.undefined)
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: js.UndefOr[OutOfViewDisplay] = js.undefined
    
    var left: js.UndefOr[OutOfViewDisplay] = js.undefined
    
    var right: js.UndefOr[OutOfViewDisplay] = js.undefined
    
    var top: js.UndefOr[OutOfViewDisplay] = js.undefined
  }
  object Bottom {
    
    inline def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: OutOfViewDisplay): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: OutOfViewDisplay): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: OutOfViewDisplay): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: OutOfViewDisplay): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Horizontal extends StObject {
    
    var horizontal: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Above] = js.undefined
  }
  object Horizontal {
    
    inline def apply(): Horizontal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Horizontal]
    }
    
    extension [Self <: Horizontal](x: Self) {
      
      inline def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: Above): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IButton> */
  trait PartialIButton extends StObject {
    
    var accept: js.UndefOr[Boolean] = js.undefined
    
    var actions: js.UndefOr[js.Array[String]] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var displayType: js.UndefOr[default | warn] = js.undefined
    
    var iconClass: js.UndefOr[String] = js.undefined
    
    var iconLabel: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
  }
  object PartialIButton {
    
    inline def apply(): PartialIButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIButton]
    }
    
    extension [Self <: PartialIButton](x: Self) {
      
      inline def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisplayType(value: default | warn): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
      
      inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
      
      inline def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services.Kernel.IModel> */
  trait PartialIModel extends StObject {
    
    var connections: js.UndefOr[Double] = js.undefined
    
    var execution_state: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var last_activity: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var traceback: js.UndefOr[String] = js.undefined
  }
  object PartialIModel {
    
    inline def apply(): PartialIModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIModel]
    }
    
    extension [Self <: PartialIModel](x: Self) {
      
      inline def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setExecution_state(value: String): Self = StObject.set(x, "execution_state", value.asInstanceOf[js.Any])
      
      inline def setExecution_stateUndefined: Self = StObject.set(x, "execution_state", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLast_activity(value: String): Self = StObject.set(x, "last_activity", value.asInstanceOf[js.Any])
      
      inline def setLast_activityUndefined: Self = StObject.set(x, "last_activity", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTraceback(value: String): Self = StObject.set(x, "traceback", value.asInstanceOf[js.Any])
      
      inline def setTracebackUndefined: Self = StObject.set(x, "traceback", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/apputils.@jupyterlab/apputils/lib/search.IScore> */
  trait PartialIScore extends StObject {
    
    var indices: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    var score: js.UndefOr[Double] = js.undefined
  }
  object PartialIScore {
    
    inline def apply(): PartialIScore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIScore]
    }
    
    extension [Self <: PartialIScore](x: Self) {
      
      inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesNull: Self = StObject.set(x, "indices", null)
      
      inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IButton> */
  trait ReadonlyIButton extends StObject {
    
    val accept: Boolean
    
    val actions: js.Array[String]
    
    val caption: String
    
    val className: String
    
    val displayType: default | warn
    
    val iconClass: String
    
    val iconLabel: String
    
    val label: String
  }
  object ReadonlyIButton {
    
    inline def apply(
      accept: Boolean,
      actions: js.Array[String],
      caption: String,
      className: String,
      displayType: default | warn,
      iconClass: String,
      iconLabel: String,
      label: String
    ): ReadonlyIButton = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], actions = actions.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyIButton]
    }
    
    extension [Self <: ReadonlyIButton](x: Self) {
      
      inline def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDisplayType(value: default | warn): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
      
      inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
      
      inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<@jupyterlab/apputils.@jupyterlab/apputils/lib/sessioncontext.ISessionContext.KernelDisplayStatus, string> */
  trait RecordKernelDisplayStatus extends StObject {
    
    @JSName("")
    var _empty: String
    
    var autorestarting: String
    
    var busy: String
    
    var connected: String
    
    var connecting: String
    
    var dead: String
    
    var disconnected: String
    
    var idle: String
    
    var initializing: String
    
    var restarting: String
    
    var starting: String
    
    var terminating: String
    
    var unknown: String
  }
  object RecordKernelDisplayStatus {
    
    inline def apply(
      _empty: String,
      autorestarting: String,
      busy: String,
      connected: String,
      connecting: String,
      dead: String,
      disconnected: String,
      idle: String,
      initializing: String,
      restarting: String,
      starting: String,
      terminating: String,
      unknown: String
    ): RecordKernelDisplayStatus = {
      val __obj = js.Dynamic.literal(autorestarting = autorestarting.asInstanceOf[js.Any], busy = busy.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], dead = dead.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], initializing = initializing.asInstanceOf[js.Any], restarting = restarting.asInstanceOf[js.Any], starting = starting.asInstanceOf[js.Any], terminating = terminating.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordKernelDisplayStatus]
    }
    
    extension [Self <: RecordKernelDisplayStatus](x: Self) {
      
      inline def setAutorestarting(value: String): Self = StObject.set(x, "autorestarting", value.asInstanceOf[js.Any])
      
      inline def setBusy(value: String): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setConnected(value: String): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setConnecting(value: String): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
      
      inline def setDead(value: String): Self = StObject.set(x, "dead", value.asInstanceOf[js.Any])
      
      inline def setDisconnected(value: String): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
      
      inline def setIdle(value: String): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setInitializing(value: String): Self = StObject.set(x, "initializing", value.asInstanceOf[js.Any])
      
      inline def setRestarting(value: String): Self = StObject.set(x, "restarting", value.asInstanceOf[js.Any])
      
      inline def setStarting(value: String): Self = StObject.set(x, "starting", value.asInstanceOf[js.Any])
      
      inline def setTerminating(value: String): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
      
      inline def setUnknown(value: String): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def set_empty(value: String): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
}
