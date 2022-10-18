package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Partitioners {
  
  @JSImport("kafkajs", "Partitioners")
  @js.native
  val ^ : js.Any = js.native
  
  inline def DefaultPartitioner(): js.Function1[/* args */ PartitionerArgs, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPartitioner")().asInstanceOf[js.Function1[/* args */ PartitionerArgs, Double]]
  @JSImport("kafkajs", "Partitioners.DefaultPartitioner")
  @js.native
  def DefaultPartitioner_FPartitioners: DefaultPartitioner = js.native
  
  inline def DefaultPartitioner_FPartitioners_=(x: DefaultPartitioner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultPartitioner")(x.asInstanceOf[js.Any])
  
  /**
    * @deprecated Use DefaultPartitioner instead
    *
    * The JavaCompatiblePartitioner was renamed DefaultPartitioner
    * and made to be the default in 2.0.0.
    */
  inline def JavaCompatiblePartitioner(): js.Function1[/* args */ PartitionerArgs, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("JavaCompatiblePartitioner")().asInstanceOf[js.Function1[/* args */ PartitionerArgs, Double]]
  /**
    * @deprecated Use DefaultPartitioner instead
    *
    * The JavaCompatiblePartitioner was renamed DefaultPartitioner
    * and made to be the default in 2.0.0.
    */
  @JSImport("kafkajs", "Partitioners.JavaCompatiblePartitioner")
  @js.native
  def JavaCompatiblePartitioner_FPartitioners: DefaultPartitioner = js.native
  
  inline def JavaCompatiblePartitioner_FPartitioners_=(x: DefaultPartitioner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JavaCompatiblePartitioner")(x.asInstanceOf[js.Any])
  
  inline def LegacyPartitioner(): js.Function1[/* args */ PartitionerArgs, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("LegacyPartitioner")().asInstanceOf[js.Function1[/* args */ PartitionerArgs, Double]]
  @JSImport("kafkajs", "Partitioners.LegacyPartitioner")
  @js.native
  def LegacyPartitioner_FPartitioners: LegacyPartitioner = js.native
  
  inline def LegacyPartitioner_FPartitioners_=(x: LegacyPartitioner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LegacyPartitioner")(x.asInstanceOf[js.Any])
}
