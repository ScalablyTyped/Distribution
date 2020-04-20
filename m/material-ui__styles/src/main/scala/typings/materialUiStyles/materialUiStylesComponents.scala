package typings.materialUiStyles

import typings.materialUiStyles.stylesProviderMod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object materialUiStylesComponents extends materialUiStylesProps {
  @scala.inline
  def StylesProvider: ComponentType[StylesProviderProps] = js.constructorOf[default].asInstanceOf[ComponentType[StylesProviderProps]]
  @scala.inline
  def ThemeProvider[T]: ComponentType[ThemeProviderProps[T]] = typings.materialUiStyles.themeProviderThemeProviderMod.default.asInstanceOf[ComponentType[ThemeProviderProps[T]]]
}

