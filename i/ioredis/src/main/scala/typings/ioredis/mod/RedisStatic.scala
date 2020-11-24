package typings.ioredis.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.ioredis.anon.TypeofCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedisStatic
  extends Instantiable0[Redis]
     with Instantiable1[(/* port */ Double) | (/* options */ RedisOptions) | (/* host */ String), Redis]
     with Instantiable2[
      js.UndefOr[(/* port */ Double) | (/* host */ String)], 
      (/* options */ RedisOptions) | (/* host */ String), 
      Redis
    ]
     with Instantiable3[
      js.UndefOr[/* port */ Double], 
      js.UndefOr[/* host */ String], 
      /* options */ RedisOptions, 
      Redis
    ] {
  
  def apply(): Redis = js.native
  def apply(host: js.UndefOr[scala.Nothing], options: RedisOptions): Redis = js.native
  def apply(host: String): Redis = js.native
  def apply(host: String, options: RedisOptions): Redis = js.native
  def apply(options: RedisOptions): Redis = js.native
  def apply(port: js.UndefOr[scala.Nothing], host: js.UndefOr[scala.Nothing], options: RedisOptions): Redis = js.native
  def apply(port: js.UndefOr[scala.Nothing], host: String): Redis = js.native
  def apply(port: js.UndefOr[scala.Nothing], host: String, options: RedisOptions): Redis = js.native
  def apply(port: Double): Redis = js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], options: RedisOptions): Redis = js.native
  def apply(port: Double, host: String): Redis = js.native
  def apply(port: Double, host: String, options: RedisOptions): Redis = js.native
  
  var Cluster: ClusterStatic = js.native
  
  var Command: TypeofCommand = js.native
}
