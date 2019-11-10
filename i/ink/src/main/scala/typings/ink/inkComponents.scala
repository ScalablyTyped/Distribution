package typings.ink

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inkComponents extends inkProps {
  @scala.inline
  def Box: ComponentType[BoxProps] = js.constructorOf[typings.ink.inkMod.Box].asInstanceOf[typings.react.reactMod.ComponentType[BoxProps]]
  @scala.inline
  def Color: ComponentType[ColorProps] = typings.ink.inkMod.Color.asInstanceOf[typings.react.reactMod.ComponentType[ColorProps]]
  @scala.inline
  def Static: ComponentType[StaticProps] = typings.ink.inkMod.Static.asInstanceOf[typings.react.reactMod.ComponentType[StaticProps]]
  @scala.inline
  def Text: ComponentType[TextProps] = typings.ink.inkMod.Text.asInstanceOf[typings.react.reactMod.ComponentType[TextProps]]
}

