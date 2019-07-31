organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "2.1.2-dd0533"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-2a4414",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-4c3f85",
  "org.scalablytyped" %%% "log-update" % "3.2.0-cdcfeb",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-5d5bf4",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-c5f4a8",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "string-width" % "4.1.0-b10cdb",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-3ba3bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        