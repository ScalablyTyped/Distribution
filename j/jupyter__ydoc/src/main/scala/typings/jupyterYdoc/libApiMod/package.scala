package typings.jupyterYdoc.libApiMod

import typings.jupyterYdoc.anon.Action
import typings.jupyterYdoc.anon.Delete
import typings.jupyterYdoc.anon.NewValue
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Delta[T] = js.Array[Delete[T]]

type MapChange = Map[String, NewValue]

type MapChanges = Map[String, Action]
