package typings
package keyvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object keyvLibStrings {
  @js.native
  sealed trait mongo extends js.Object
  
  @js.native
  sealed trait mongodb extends js.Object
  
  @js.native
  sealed trait mysql extends js.Object
  
  @js.native
  sealed trait postgres extends js.Object
  
  @js.native
  sealed trait postgresql extends js.Object
  
  @js.native
  sealed trait redis extends js.Object
  
  @js.native
  sealed trait sqlite extends js.Object
  
  def mongo: mongo = "mongo".asInstanceOf[mongo]
  def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  def mysql: mysql = "mysql".asInstanceOf[mysql]
  def postgres: postgres = "postgres".asInstanceOf[postgres]
  def postgresql: postgresql = "postgresql".asInstanceOf[postgresql]
  def redis: redis = "redis".asInstanceOf[redis]
  def sqlite: sqlite = "sqlite".asInstanceOf[sqlite]
}

