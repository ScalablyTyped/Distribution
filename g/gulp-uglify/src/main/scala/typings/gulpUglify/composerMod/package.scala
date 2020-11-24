package typings.gulpUglify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object composerMod {
  
  type Composer = js.Function2[
    /* uglify */ typings.gulpUglify.composerMod.Uglify, 
    /* log */ typings.gulpUglify.composerMod.Logger, 
    js.Function1[
      /* options */ js.UndefOr[typings.gulpUglify.mod.Options], 
      typings.node.NodeJS.ReadWriteStream
    ]
  ]
}
