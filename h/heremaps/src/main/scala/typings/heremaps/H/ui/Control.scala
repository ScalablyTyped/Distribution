package typings.heremaps.H.ui

import typings.heremaps.H.Map_
import typings.heremaps.H.Map_.EngineType
import typings.heremaps.H.ui.base.Container
import typings.heremaps.H.ui.i18n.Localization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the base class for UI controls on the map.
  */
@js.native
trait Control extends Container {
  
  /**
    * This method returns this control&#x27;s layout alignment.
    * @returns {H.ui.LayoutAlignment} - the control&#x27;s current layout alignment
    */
  def getAlignment(): LayoutAlignment = js.native
  
  /**
    * This method returns the localization object which corresponds to the UI&#x27;s current locale.
    * @returns {H.ui.i18n.Localization}
    */
  def getLocalization(): Localization = js.native
  
  /**
    * This method returns the map to which this control is attached.
    * @returns {?H.Map} - return the map
    */
  def getMap(): Map_ = js.native
  
  /**
    * This abstract method can be overridden by deriving classes to be invoked when the underlying map engine changes.
    * @param engineType {H.Map.EngineType} - the engine type the map currently uses
    */
  def onMapEngineTypeChange(engineType: EngineType): Unit = js.native
  
  /**
    * This abstract method can be overridden by deriving classes to be invoked when the UI object&#x27;s unit system changes.
    * @param unitSystem {H.ui.UnitSystem} - the unit system the UI currently uses
    */
  def onUnitSystemChange(unitSystem: UnitSystem): Unit = js.native
  
  /**
    * This method sets the control&#x27;s layout alignments.
    * @param alignment {H.ui.LayoutAlignment} - The new alignment of the control
    * @returns {H.ui.Control} - returns this control instance
    */
  def setAlignment(alignment: LayoutAlignment): Control = js.native
}
