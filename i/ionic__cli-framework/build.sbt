organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "2.0.3-09e184"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-db1aed",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-f79abd",
  "org.scalablytyped" %%% "log-update" % "3.2.0-9d0f86",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-7bd4e1",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-990046",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "string-width" % "4.1.0-0cae32",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-d1d8ae")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        