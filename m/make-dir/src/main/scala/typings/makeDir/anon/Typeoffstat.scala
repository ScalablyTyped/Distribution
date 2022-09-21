package typings.makeDir.anon

import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoffstat extends StObject {
  
  def apply(
    fd: Double,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* stats */ Stats, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    options: Unit,
    callback: js.Function2[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      BigIntStats | (/* stats */ Stats), 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    options: StatOptionsbigintfalseund,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* stats */ Stats, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    options: StatOptionsbiginttrue,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* stats */ BigIntStats, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    options: StatOptions,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* stats */ Stats | BigIntStats, 
      Unit
    ]
  ): Unit = js.native
}
