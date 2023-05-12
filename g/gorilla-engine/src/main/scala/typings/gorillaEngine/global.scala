package typings.gorillaEngine

import typings.gorillaEngine.GorillaEngine.Blob
import typings.gorillaEngine.GorillaEngine.Instrument
import typings.gorillaEngine.GorillaEngine.PreviewPlayer
import typings.gorillaEngine.GorillaEngine.UI.Modulation
import typings.gorillaEngine.anon.AllowMultiple
import typings.gorillaEngine.anon.Count
import typings.gorillaEngine.anon.Direction
import typings.gorillaEngine.anon.Down
import typings.gorillaEngine.anon.End
import typings.gorillaEngine.anon.FillColor
import typings.gorillaEngine.anon.FocusColor
import typings.gorillaEngine.anon.PartialAmpEnvProps
import typings.gorillaEngine.anon.PartialAmpItem
import typings.gorillaEngine.anon.PartialBarStepEditorProps
import typings.gorillaEngine.anon.PartialComboBoxPadding
import typings.gorillaEngine.anon.PartialComboBoxPopupStyle
import typings.gorillaEngine.anon.PartialComboBoxPopupStyleBackgroundColor
import typings.gorillaEngine.anon.PartialComboBoxProps
import typings.gorillaEngine.anon.PartialDragContainerProps
import typings.gorillaEngine.anon.PartialDragTargetProps
import typings.gorillaEngine.anon.PartialDropZoneProps
import typings.gorillaEngine.anon.PartialKnobProps
import typings.gorillaEngine.anon.PartialLabelProps
import typings.gorillaEngine.anon.PartialLevelMeterProps
import typings.gorillaEngine.anon.PartialListBoxProps
import typings.gorillaEngine.anon.PartialLottieAnimationPro
import typings.gorillaEngine.anon.PartialMidiKeyboardKeys
import typings.gorillaEngine.anon.PartialMidiKeyboardProps
import typings.gorillaEngine.anon.PartialModulation
import typings.gorillaEngine.anon.PartialPadProps
import typings.gorillaEngine.anon.PartialScrollViewProps
import typings.gorillaEngine.anon.PartialSliceEditorProps
import typings.gorillaEngine.anon.PartialSliderProps
import typings.gorillaEngine.anon.PartialStepEditorProps
import typings.gorillaEngine.anon.PartialTextBoxProps
import typings.gorillaEngine.anon.PartialToggleProps
import typings.gorillaEngine.anon.PartialTriggerProps
import typings.gorillaEngine.anon.PartialWaveformDragZone
import typings.gorillaEngine.anon.PartialWaveformMarker
import typings.gorillaEngine.anon.PartialWaveformProps
import typings.gorillaEngine.anon.PartialarrowIconstringarr
import typings.gorillaEngine.anon.PartialbackgroundColorstr
import typings.gorillaEngine.anon.Partialcolorstringthickne
import typings.gorillaEngine.anon.PartialnormalPartialSlice
import typings.gorillaEngine.anon.Partialnormalstringhovers
import typings.gorillaEngine.anon.Partialpositionstringheig
import typings.gorillaEngine.anon.Partialxnumberynumberwidt
import typings.gorillaEngine.anon.PartialxnumberynumberwidtBackgroundColor
import typings.gorillaEngine.anon.`0`
import typings.gorillaEngine.gorillaEngineStrings.IBeam
import typings.gorillaEngine.gorillaEngineStrings.`bottom center`
import typings.gorillaEngine.gorillaEngineStrings.`bottom edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom left`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`bottom right`
import typings.gorillaEngine.gorillaEngineStrings.`centered left`
import typings.gorillaEngine.gorillaEngineStrings.`centered right`
import typings.gorillaEngine.gorillaEngineStrings.`cross hair`
import typings.gorillaEngine.gorillaEngineStrings.`dragging hand`
import typings.gorillaEngine.gorillaEngineStrings.`left edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`pointing hand`
import typings.gorillaEngine.gorillaEngineStrings.`right edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top center`
import typings.gorillaEngine.gorillaEngineStrings.`top edge resize`
import typings.gorillaEngine.gorillaEngineStrings.`top left corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`top left`
import typings.gorillaEngine.gorillaEngineStrings.`top right corner resize`
import typings.gorillaEngine.gorillaEngineStrings.`top right`
import typings.gorillaEngine.gorillaEngineStrings.`up down left right resize`
import typings.gorillaEngine.gorillaEngineStrings.`up down resize`
import typings.gorillaEngine.gorillaEngineStrings.center
import typings.gorillaEngine.gorillaEngineStrings.copying
import typings.gorillaEngine.gorillaEngineStrings.float
import typings.gorillaEngine.gorillaEngineStrings.horizontal
import typings.gorillaEngine.gorillaEngineStrings.int
import typings.gorillaEngine.gorillaEngineStrings.integer
import typings.gorillaEngine.gorillaEngineStrings.left
import typings.gorillaEngine.gorillaEngineStrings.none
import typings.gorillaEngine.gorillaEngineStrings.normal
import typings.gorillaEngine.gorillaEngineStrings.right
import typings.gorillaEngine.gorillaEngineStrings.string
import typings.gorillaEngine.gorillaEngineStrings.vertical
import typings.gorillaEngine.gorillaEngineStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GorillaEngine {
    
    @JSGlobal("GorillaEngine")
    @js.native
    val ^ : js.Any = js.native
    
    object UI {
      
      @JSGlobal("GorillaEngine.UI")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("GorillaEngine.UI.AmpEnv")
      @js.native
      open class AmpEnv protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.AmpEnv {
        def this(options: PartialAmpEnvProps) = this()
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var attack: PartialAmpItem = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var curve: Partialcolorstringthickne = js.native
        
        /* CompleteClass */
        var decay: PartialAmpItem = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var font: String = js.native
        
        /* CompleteClass */
        var fontKerning: Double = js.native
        
        /* CompleteClass */
        var fontSize: Double = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        var release: PartialAmpItem = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var sustain: PartialAmpItem = js.native
        
        /* CompleteClass */
        var textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`) = js.native
        
        /* CompleteClass */
        var textColor: String = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.BarStepEditor")
      @js.native
      open class BarStepEditor protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.BarStepEditor {
        def this(options: PartialBarStepEditorProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var divSize: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var endIndex: Double = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var max: Double = js.native
        
        /* CompleteClass */
        var min: Double = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var paramPath: String = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var startIndex: Double = js.native
        
        /* CompleteClass */
        var step: Partialxnumberynumberwidt = js.native
        
        /* CompleteClass */
        var value: Any = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.ComboBox")
      @js.native
      open class ComboBox protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.ComboBox {
        def this(options: PartialComboBoxProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundColorClicked: String = js.native
        
        /* CompleteClass */
        var backgroundColorHover: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var font: String = js.native
        
        /* CompleteClass */
        var fontKerning: Double = js.native
        
        /* CompleteClass */
        var fontSize: Double = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        var images: PartialarrowIconstringarr = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var itemReselectedAction: String = js.native
        
        /**
          * List of options
          */
        /* CompleteClass */
        var items: js.Array[String] = js.native
        
        /**
          * The character that signifies heirarchy within the items array
          */
        /* CompleteClass */
        var levelSeperator: String = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var padding: PartialComboBoxPadding | Double = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        var popup: PartialComboBoxPopupStyle = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var scrollWheelEnabled: Boolean = js.native
        
        /* CompleteClass */
        var stretchText: Boolean = js.native
        
        /* CompleteClass */
        var styleSubmenu: Boolean = js.native
        
        /* CompleteClass */
        var subPopup: PartialComboBoxPopupStyleBackgroundColor = js.native
        
        /* CompleteClass */
        var textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`) = js.native
        
        /* CompleteClass */
        var textColor: String = js.native
        
        /* CompleteClass */
        var value: Double = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      /* note: abstract class */ @JSGlobal("GorillaEngine.UI.Component")
      @js.native
      open class Component ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.Component {
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.DragContainer")
      @js.native
      open class DragContainer protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.DragContainer {
        def this(options: PartialDragContainerProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var destinationCanMoveDraggedFiles: Boolean = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var dragContent: String = js.native
        
        /* CompleteClass */
        var dragGroup: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var externalDragEndAction: String = js.native
        
        /* CompleteClass */
        var externalDragStartAction: String = js.native
        
        /* CompleteClass */
        var externallyDraggedFiles: Any = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var onDragging: String = js.native
        
        /* CompleteClass */
        var onExternalDragEnd: String = js.native
        
        /* CompleteClass */
        var onExternalDragStart: String = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.DragTarget")
      @js.native
      open class DragTarget protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.DragTarget {
        def this(options: PartialDragTargetProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var dragGroup: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var onDrop: String = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.DropZone")
      @js.native
      open class DropZone protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.DropZone {
        def this(options: PartialDropZoneProps) = this()
        
        /* CompleteClass */
        var acceptedFileTypes: js.Array[String] | String = js.native
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var onDraggedFiles: String = js.native
        
        /* CompleteClass */
        var onDroppedFile: String = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.Knob")
      @js.native
      open class Knob protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.Knob {
        def this(options: PartialKnobProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        var animation: typings.gorillaEngine.GorillaEngine.UI.LottieAnimation = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var filmstrip: Direction = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var max: Double = js.native
        
        /* CompleteClass */
        var min: Double = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var stepSize: Double = js.native
        
        /* CompleteClass */
        var text: String = js.native
        
        /* CompleteClass */
        var value: Double = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      /**
        * Use a Label to...
        */
      @JSGlobal("GorillaEngine.UI.Label")
      @js.native
      open class Label protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.Label {
        def this(options: PartialLabelProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var font: String = js.native
        
        /* CompleteClass */
        var fontKerning: Double = js.native
        
        /* CompleteClass */
        var fontSize: Double = js.native
        
        /* CompleteClass */
        var format: String = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        var multiLine: Boolean = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var text: String | Double = js.native
        
        /* CompleteClass */
        var textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`) = js.native
        
        /* CompleteClass */
        var textColor: String = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.LevelMeter")
      @js.native
      open class LevelMeter protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.LevelMeter {
        def this(options: PartialLevelMeterProps) = this()
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        var animation: typings.gorillaEngine.GorillaEngine.UI.LottieAnimation = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var direction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var fillArea: Boolean = js.native
        
        /* CompleteClass */
        var filmstrip: Direction = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        var indicatorThickness: Double = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var inverted: Boolean = js.native
        
        /* CompleteClass */
        var levelColor: String = js.native
        
        /* CompleteClass */
        var logScale: Boolean = js.native
        
        /* CompleteClass */
        var max: Double = js.native
        
        /* CompleteClass */
        var maxRampDownSpeed: Double = js.native
        
        /* CompleteClass */
        var min: Double = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        var peakColor: String = js.native
        
        /* CompleteClass */
        var peakHold: Boolean = js.native
        
        /* CompleteClass */
        var positionIndicator: Boolean = js.native
        
        /* CompleteClass */
        var rampDownFactor: Double = js.native
        
        /* CompleteClass */
        var rampUpFactor: Double = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var stereo: Boolean = js.native
        
        /* CompleteClass */
        var value: Any = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var visibleSectionEnd: Double = js.native
        
        /* CompleteClass */
        var visibleSectionStart: Double = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.ListBox")
      @js.native
      open class ListBox protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.ListBox {
        def this(options: PartialListBoxProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var font: String = js.native
        
        /* CompleteClass */
        var fontKerning: Double = js.native
        
        /* CompleteClass */
        var fontSize: Double = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`) = js.native
        
        /* CompleteClass */
        var textColor: String = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.LottieAnimation")
      @js.native
      open class LottieAnimation protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.LottieAnimation {
        def this(options: PartialLottieAnimationPro) = this()
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var autoplay: Boolean = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var filePath: String = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var loop: Boolean = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def pause(): Unit = js.native
        
        /* CompleteClass */
        override def play(): Unit = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        override def setFrame(frame: Double): Unit = js.native
        
        /* CompleteClass */
        override def setFrameFromLinearTransform(value: Double, min: Double, max: Double): Unit = js.native
        
        /* CompleteClass */
        override def setProperties(selector: String, settings: FillColor): Unit = js.native
        
        /* CompleteClass */
        override def stop(): Unit = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.MidiKeyboard")
      @js.native
      open class MidiKeyboard protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.MidiKeyboard {
        def this(props: PartialMidiKeyboardProps) = this()
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var disableNKSColors: Boolean = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var highKey: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var keys: PartialMidiKeyboardKeys = js.native
        
        /* CompleteClass */
        var lowKey: Double = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.Pad")
      @js.native
      open class Pad protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.Pad {
        def this(options: PartialPadProps) = this()
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        var images: Partialnormalstringhovers = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var keyboardFocus: `0` = js.native
        
        /* CompleteClass */
        var midiNote: Double = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var padState: Boolean = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var velocity: Double = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.ScrollView")
      @js.native
      open class ScrollView protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.ScrollView {
        def this(options: PartialScrollViewProps) = this()
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var hideHorizontalScrollbar: Boolean = js.native
        
        /* CompleteClass */
        var hideVerticalScrollbar: Boolean = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var scrollbarThickness: Double = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.SliceEditor")
      @js.native
      open class SliceEditor protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.SliceEditor {
        def this(options: PartialSliceEditorProps) = this()
        
        /* CompleteClass */
        override def addMarker(marker: Any): Unit = js.native
        
        /* CompleteClass */
        override def addModulation(modulation: PartialModulation): Modulation = js.native
        
        /* CompleteClass */
        override def addSlice(slice: Any): Unit = js.native
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var audioLengthInBeats: Double = js.native
        
        /* CompleteClass */
        var audioLengthInSamples: Double = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var canAddSlices: Boolean = js.native
        
        /* CompleteClass */
        var canChangeSlices: Boolean = js.native
        
        /* CompleteClass */
        var canRemoveSlices: Boolean = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        override def clearSlices(): Unit = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        override def getSlicesForZoneModule(): js.Array[Any] = js.native
        
        /* CompleteClass */
        var grid: Partialpositionstringheig = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        override def mappedSampleChanged(): Unit = js.native
        
        /* CompleteClass */
        var minSliceSpacing: Double = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var modulations: js.Array[Modulation] = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        override def removeSlice(slice: Any): Unit = js.native
        
        /* CompleteClass */
        var selectionAreaStyle: PartialbackgroundColorstr = js.native
        
        /* CompleteClass */
        override def setZoom(start: Double, end: Double): Unit = js.native
        
        /* CompleteClass */
        var sliceStyles: PartialnormalPartialSlice = js.native
        
        /* CompleteClass */
        var slices: Any = js.native
        
        /* CompleteClass */
        var snapSlicesToGrid: Boolean = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
        
        /* CompleteClass */
        var zoom: End = js.native
      }
      
      /**
        * Use a slider to
        * - enable users to control numeric values by dragging up/down or left/right
        */
      @JSGlobal("GorillaEngine.UI.Slider")
      @js.native
      open class Slider protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.Slider {
        def this(options: PartialSliderProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        var animation: typings.gorillaEngine.GorillaEngine.UI.LottieAnimation = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var direction: horizontal | vertical = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var filmstrip: Count = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var max: Double = js.native
        
        /* CompleteClass */
        var min: Double = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var text: String = js.native
        
        /* CompleteClass */
        var value: Double = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.StepEditor")
      @js.native
      open class StepEditor protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.StepEditor {
        def this(options: PartialStepEditorProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var divSize: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var endIndex: Double = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var max: Double = js.native
        
        /* CompleteClass */
        var min: Double = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var paramPath: String = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var startIndex: Double = js.native
        
        /* CompleteClass */
        var step: PartialxnumberynumberwidtBackgroundColor = js.native
        
        /* CompleteClass */
        var value: Any = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.TextBox")
      @js.native
      open class TextBox protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.TextBox {
        def this(props: PartialTextBoxProps) = this()
        
        /* CompleteClass */
        var acceptedDataType: integer | int | float | string = js.native
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var caretColor: String = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var font: String = js.native
        
        /* CompleteClass */
        var fontKerning: Double = js.native
        
        /* CompleteClass */
        var fontSize: Double = js.native
        
        /* CompleteClass */
        override def grabKeyboardFocus(): Unit = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var highlightColor: String = js.native
        
        /* CompleteClass */
        var highlightTextColor: String = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var maxLength: Double = js.native
        
        /* CompleteClass */
        var maxValue: Double = js.native
        
        /* CompleteClass */
        var minValue: Double = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        var multiLine: Boolean = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var palceholder: String = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        var passwordCharacter: String = js.native
        
        /* CompleteClass */
        var placeHolderColor: String = js.native
        
        /* CompleteClass */
        var readOnly: Boolean = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var text: String = js.native
        
        /* CompleteClass */
        var textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`) = js.native
        
        /* CompleteClass */
        var textColor: String = js.native
        
        /* CompleteClass */
        var unit: String = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.Toggle")
      @js.native
      open class Toggle protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.Toggle {
        def this(options: PartialToggleProps) = this()
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        var animation: typings.gorillaEngine.GorillaEngine.UI.LottieAnimation = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var disabledImage: String = js.native
        
        /* CompleteClass */
        var drawTick: Boolean = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var fitToText: Boolean = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var offColor: String = js.native
        
        /* CompleteClass */
        var offColorHover: String = js.native
        
        /* CompleteClass */
        var offImage: String = js.native
        
        /* CompleteClass */
        var offImageHovered: String = js.native
        
        /* CompleteClass */
        var offImagePressed: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var onColor: String = js.native
        
        /* CompleteClass */
        var onColorHover: String = js.native
        
        /* CompleteClass */
        var onImage: String = js.native
        
        /* CompleteClass */
        var onImageHovered: String = js.native
        
        /* CompleteClass */
        var onImagePressed: String = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        var radioIndex: Double = js.native
        
        /* CompleteClass */
        var radioValue: Double = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var text: String = js.native
        
        /* CompleteClass */
        var textColorOff: String = js.native
        
        /* CompleteClass */
        var textColorOffHover: String = js.native
        
        /* CompleteClass */
        var textColorOn: String = js.native
        
        /* CompleteClass */
        var textColorOnHover: String = js.native
        
        /* CompleteClass */
        var value: Boolean = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.Trigger")
      @js.native
      open class Trigger protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.Trigger {
        def this(options: PartialTriggerProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        var animation: typings.gorillaEngine.GorillaEngine.UI.LottieAnimation = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var font: String = js.native
        
        /* CompleteClass */
        var fontKerning: Double = js.native
        
        /* CompleteClass */
        var fontSize: Double = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        var images: Down = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var keyboardFocus: `0` = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var text: String = js.native
        
        /* CompleteClass */
        var textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`) = js.native
        
        /* CompleteClass */
        var textColor: String = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      @JSGlobal("GorillaEngine.UI.Waveform")
      @js.native
      open class Waveform protected ()
        extends StObject
           with typings.gorillaEngine.GorillaEngine.UI.Waveform {
        def this(options: PartialWaveformProps) = this()
        
        /* CompleteClass */
        var allowClicksOnChildren: Boolean = js.native
        
        /* CompleteClass */
        var alpha: Double = js.native
        
        /* CompleteClass */
        var alwaysOnTop: Boolean = js.native
        
        /* CompleteClass */
        override def appendChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var backgroundColor: String = js.native
        
        /* CompleteClass */
        var backgroundImage: String = js.native
        
        /* CompleteClass */
        var border: FocusColor = js.native
        
        /* CompleteClass */
        var children: js.Array[typings.gorillaEngine.GorillaEngine.UI.Component] = js.native
        
        /* CompleteClass */
        var clickGrabsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var clickMask: String = js.native
        
        /* CompleteClass */
        var cornerRadius: Double = js.native
        
        /* CompleteClass */
        var doubleClickAction: String = js.native
        
        /* CompleteClass */
        var dragzone: PartialWaveformDragZone = js.native
        
        /* CompleteClass */
        var enabled: Boolean = js.native
        
        /* CompleteClass */
        var fitHeight: Boolean = js.native
        
        /* CompleteClass */
        var font: String = js.native
        
        /* CompleteClass */
        var fontKerning: Double = js.native
        
        /* CompleteClass */
        var fontSize: Double = js.native
        
        /* CompleteClass */
        var gradientCenterColor: String = js.native
        
        /* CompleteClass */
        var gradientEndColor: String = js.native
        
        /* CompleteClass */
        var height: Double = js.native
        
        /* CompleteClass */
        var horizontalAxisColor: String = js.native
        
        /* CompleteClass */
        var id: String = js.native
        
        /* CompleteClass */
        var initialXOffset: Double = js.native
        
        /* CompleteClass */
        override def insertBefore(
          child: typings.gorillaEngine.GorillaEngine.UI.Component,
          beforeChild: typings.gorillaEngine.GorillaEngine.UI.Component
        ): Unit = js.native
        
        /* CompleteClass */
        var interceptsMouseClicks: Boolean = js.native
        
        /* CompleteClass */
        var markers: PartialWaveformMarker = js.native
        
        /* CompleteClass */
        var modifiedClickAction: String = js.native
        
        /* CompleteClass */
        var mouseCursorType: none | normal | wait | IBeam | (`cross hair`) | copying | (`pointing hand`) | (`dragging hand`) | (`left right resize`) | (`up down resize`) | (`up down left right resize`) | (`top edge resize`) | (`bottom edge resize`) | (`left edge resize`) | (`right edge resize`) | (`top left corner resize`) | (`top right corner resize`) | (`bottom left corner resize`) | (`bottom right corner resize`) = js.native
        
        /* CompleteClass */
        var mouseEnterAction: String = js.native
        
        /* CompleteClass */
        var mouseExitAction: String = js.native
        
        /* CompleteClass */
        override def on(event: String, handler: Any): Unit = js.native
        
        /* CompleteClass */
        var paintCenterLine: Boolean = js.native
        
        /* CompleteClass */
        var parent: typings.gorillaEngine.GorillaEngine.UI.Component = js.native
        
        /* CompleteClass */
        override def removeChild(child: typings.gorillaEngine.GorillaEngine.UI.Component): Unit = js.native
        
        /* CompleteClass */
        var textAlign: (`centered left`) | (`centered right`) | left | right | center | (`top left`) | (`top right`) | (`top center`) | (`bottom left`) | (`bottom right`) | (`bottom center`) = js.native
        
        /* CompleteClass */
        var textColor: String = js.native
        
        /* CompleteClass */
        var value: Double = js.native
        
        /* CompleteClass */
        var verticalPadding: Double = js.native
        
        /* CompleteClass */
        var visible: Boolean = js.native
        
        /* CompleteClass */
        var wantsKeyboardFocus: Boolean = js.native
        
        /* CompleteClass */
        var waveHorizontalSapcing: Double = js.native
        
        /* CompleteClass */
        var waveWidth: Double = js.native
        
        /* CompleteClass */
        var waveformColor: String = js.native
        
        /* CompleteClass */
        var waveformUnavailableText: String = js.native
        
        /* CompleteClass */
        var width: Double = js.native
        
        /**
          * The x position of the component
          */
        /* CompleteClass */
        var x: Double = js.native
        
        /* CompleteClass */
        var y: Double = js.native
      }
      
      inline def getControlById(id: String): typings.gorillaEngine.GorillaEngine.UI.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlById")(id.asInstanceOf[js.Any]).asInstanceOf[typings.gorillaEngine.GorillaEngine.UI.Component]
      
      inline def loadUIfromYAML(ymlPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadUIfromYAML")(ymlPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    inline def disposeInstrument(instrument: Instrument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeInstrument")(instrument.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getBuildInformation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuildInformation")().asInstanceOf[Any]
    
    inline def getManufacturerName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getManufacturerName")().asInstanceOf[String]
    
    inline def getPluginAE(v: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginAE")(v.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getPluginMM(v: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginMM")(v.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getPluginName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginName")().asInstanceOf[String]
    
    inline def getPreviewPlayer(): PreviewPlayer = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreviewPlayer")().asInstanceOf[PreviewPlayer]
    
    inline def getResourcePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourcePath")().asInstanceOf[String]
    
    inline def loadBlob(blobPath: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("loadBlob")(blobPath.asInstanceOf[js.Any]).asInstanceOf[Blob]
    
    inline def openFileChooser(config: AllowMultiple): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openFileChooser")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def openURLinBrowser(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openURLinBrowser")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerUncaughtUIExceptionCallback(handler: js.Function1[/* err */ js.Error, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerUncaughtUIExceptionCallback")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("GorillaEngine.sessionSaveLoadCallbackTimeoutMs")
    @js.native
    def sessionSaveLoadCallbackTimeoutMs: Double = js.native
    inline def sessionSaveLoadCallbackTimeoutMs_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sessionSaveLoadCallbackTimeoutMs")(x.asInstanceOf[js.Any])
    
    inline def setActiveInstrument(instrument: Instrument): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setActiveInstrument")(instrument.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setSessionLoadCallback(callback: Any, instance: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSessionLoadCallback")(callback.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setSessionSaveCallback(callback: Any, instance: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setSessionSaveCallback")(callback.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
