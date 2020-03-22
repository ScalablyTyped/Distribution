package typings.materialUiStyles

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object materialUiStylesComponents extends materialUiStylesProps {
  @scala.inline
  def StylesProvider: ComponentType[StylesProviderProps] = js.constructorOf[typings.materialUiStyles.stylesProviderMod.default].asInstanceOf[typings.react.mod.ComponentType[StylesProviderProps]]
  @scala.inline
  def ThemeProvider[T]: ComponentType[ThemeProviderProps[T]] = typings.materialUiStyles.themeProviderThemeProviderMod.default.asInstanceOf[typings.react.mod.ComponentType[ThemeProviderProps[T]]]
}

