package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoCompleteProps[DataItem] extends TextFieldProps {
  var anchorOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[
      materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ]
  ] = js.undefined
  var dataSource: js.Array[DataItem]
  var dataSourceConfig: js.UndefOr[materialDashUiLib.Anon_Text] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[
    js.Function3[
      /* searchText */ java.lang.String, 
      /* key */ java.lang.String, 
      /* item */ DataItem, 
      scala.Boolean
    ]
  ] = js.undefined
  var listStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var maxSearchResults: js.UndefOr[scala.Double] = js.undefined
  var menuCloseDelay: js.UndefOr[scala.Double] = js.undefined
  var menuProps: js.UndefOr[js.Any] = js.undefined
  var menuStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onNewRequest: js.UndefOr[js.Function2[/* chosenRequest */ DataItem, /* index */ scala.Double, scala.Unit]] = js.undefined
  var onUpdateInput: js.UndefOr[
    js.Function2[/* searchText */ java.lang.String, /* dataSource */ js.Array[DataItem], scala.Unit]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var openOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var popoverProps: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverProps] = js.undefined
  var searchText: js.UndefOr[java.lang.String] = js.undefined
  var targetOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var textFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

