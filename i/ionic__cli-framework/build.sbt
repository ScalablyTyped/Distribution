organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.7.0-862d41"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190424Z-cdee26",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-c08eea",
  "org.scalablytyped" %%% "log-update" % "3.2.0-b40859",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-e88cfd",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-830250",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "string-width" % "4.1.0-b6f155",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-fa71a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        