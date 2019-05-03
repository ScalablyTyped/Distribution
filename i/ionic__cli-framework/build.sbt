organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.7.0-ea7f59"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190424Z-fc1959",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-eb7496",
  "org.scalablytyped" %%% "log-update" % "3.2.0-056f45",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-a4867d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-58c2b6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "string-width" % "4.1.0-9e2b1d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-21358e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        