package typings
package heremapsLib.HNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This class represents the base class for UI controls on the map.
         */
@JSGlobal("H.ui.Control")
@js.native
class Control ()
  extends heremapsLib.HNs.uiNs.baseNs.Container {
  /**
               * This method returns this control&#x27;s layout alignment.
               * @returns {H.ui.LayoutAlignment} - the control&#x27;s current layout alignment
               */
  def getAlignment(): LayoutAlignment = js.native
  /**
               * This method returns the localization object which corresponds to the UI&#x27;s current locale.
               * @returns {H.ui.i18n.Localization}
               */
  def getLocalization(): heremapsLib.HNs.uiNs.i18nNs.Localization = js.native
  /**
               * This method returns the map to which this control is attached.
               * @returns {?H.Map} - return the map
               */
  def getMap(): heremapsLib.HNs.Map = js.native
  /**
               * This abstract method can be overridden by deriving classes to be invoked when the underlying map engine changes.
               * @param engineType {H.Map.EngineType} - the engine type the map currently uses
               */
  def onMapEngineTypeChange(engineType: heremapsLib.HNs.MapNs.EngineType): scala.Unit = js.native
  /**
               * This abstract method can be overridden by deriving classes to be invoked when the UI object&#x27;s unit system changes.
               * @param unitSystem {H.ui.UnitSystem} - the unit system the UI currently uses
               */
  def onUnitSystemChange(unitSystem: UnitSystem): scala.Unit = js.native
  /**
               * This method sets the control&#x27;s layout alignments.
               * @param alignment {H.ui.LayoutAlignment} - The new alignment of the control
               * @returns {H.ui.Control} - returns this control instance
               */
  def setAlignment(alignment: LayoutAlignment): Control = js.native
}

