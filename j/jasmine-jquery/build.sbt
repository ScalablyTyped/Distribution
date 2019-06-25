organization := "org.scalablytyped"
name := "jasmine-jquery"
version := "1.5.8-dt-20190322Z-0d72fc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20190528Z-b6433f",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190624Z-9b43ed",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-29a319",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        