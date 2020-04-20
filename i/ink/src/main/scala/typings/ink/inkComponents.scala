package typings.ink

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inkComponents extends inkProps {
  @scala.inline
  def Box: ComponentType[BoxProps] = js.constructorOf[typings.ink.mod.Box].asInstanceOf[ComponentType[BoxProps]]
  @scala.inline
  def Color: ComponentType[ColorProps] = typings.ink.mod.Color.asInstanceOf[ComponentType[ColorProps]]
  @scala.inline
  def Static: ComponentType[StaticProps] = typings.ink.mod.Static.asInstanceOf[ComponentType[StaticProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = typings.ink.mod.Text.asInstanceOf[ComponentType[TextProps]]
}

