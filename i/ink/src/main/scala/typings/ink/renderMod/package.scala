package typings.ink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object renderMod {
  
  type RenderFunction = js.Function2[
    /* tree */ typings.react.mod.ReactElement, 
    /* options */ js.UndefOr[
      typings.node.processMod.global.NodeJS.WriteStream | typings.ink.renderMod.RenderOptions
    ], 
    typings.ink.renderMod.Instance
  ]
}
