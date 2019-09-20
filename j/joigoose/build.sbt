organization := "org.scalablytyped"
name := "joigoose"
version := "2.0-dt-20190719Z-2bcbd5"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-893ce4",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-aeaeee",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20190919Z-69c377",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190904Z-5c2cbf",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        